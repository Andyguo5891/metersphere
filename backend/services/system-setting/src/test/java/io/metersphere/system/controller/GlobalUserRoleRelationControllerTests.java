package io.metersphere.system.controller;

import base.BaseTest;
import io.metersphere.sdk.constants.PermissionConstants;
import io.metersphere.sdk.dto.UserRoleRelationUserDTO;
import io.metersphere.sdk.dto.request.GlobalUserRoleRelationUpdateRequest;
import io.metersphere.sdk.log.constants.OperationLogType;
import io.metersphere.sdk.util.Pager;
import io.metersphere.system.controller.param.GlobalUserRoleRelationQueryRequestDefinition;
import io.metersphere.system.controller.param.GlobalUserRoleRelationUpdateRequestDefinition;
import io.metersphere.system.domain.UserRole;
import io.metersphere.system.domain.UserRoleRelation;
import io.metersphere.system.domain.UserRoleRelationExample;
import io.metersphere.system.dto.request.GlobalUserRoleRelationQueryRequest;
import io.metersphere.system.mapper.UserRoleMapper;
import io.metersphere.system.mapper.UserRoleRelationMapper;
import jakarta.annotation.Resource;
import org.apache.commons.collections.CollectionUtils;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import static io.metersphere.sdk.constants.InternalUserRole.ADMIN;
import static io.metersphere.sdk.constants.InternalUserRole.ORG_ADMIN;
import static io.metersphere.sdk.controller.handler.result.CommonResultCode.USER_ROLE_RELATION_EXIST;
import static io.metersphere.sdk.controller.handler.result.CommonResultCode.USER_ROLE_RELATION_REMOVE_ADMIN_USER_PERMISSION;
import static io.metersphere.system.controller.result.SystemResultCode.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GlobalUserRoleRelationControllerTests extends BaseTest {
    public static final String BASE_URL = "/user/role/relation/global/";

    // 保存创建的数据，方便之后的修改和删除测试使用
    private static UserRoleRelation addUserRoleRelation;
    @Resource
    private UserRoleMapper userRoleMapper;
    @Resource
    private UserRoleRelationMapper userRoleRelationMapper;
    @Override
    protected String getBasePath() {
        return BASE_URL;
    }

    @Test
    void list() throws Exception {

        GlobalUserRoleRelationQueryRequest request = new GlobalUserRoleRelationQueryRequest();
        request.setCurrent(1);
        request.setPageSize(10);
        request.setRoleId(ADMIN.getValue());

        // @@正常请求
        MvcResult mvcResult = this.requestPostWithOkAndReturn(DEFAULT_LIST, request);
        Pager<List<UserRoleRelationUserDTO>> pageResult = getPageResult(mvcResult, UserRoleRelationUserDTO.class);
        List<UserRoleRelationUserDTO> listRes = pageResult.getList();
        Set<String> userIdSet = listRes.stream()
                .map(UserRoleRelationUserDTO::getUserId).collect(Collectors.toSet());

        UserRoleRelationExample example = new UserRoleRelationExample();
        example.createCriteria()
                .andRoleIdEqualTo(request.getRoleId())
                .andUserIdIn(listRes.stream().map(UserRoleRelationUserDTO::getUserId).toList());
        Set<String> dbUserIdSet = userRoleRelationMapper.selectByExample(example).stream()
                .map(UserRoleRelation::getUserId).collect(Collectors.toSet());
        // 检查查询结果和数据库结果是否一致
        Assertions.assertEquals(userIdSet, dbUserIdSet);

        // @@操作非系统级别用户组异常
        request.setRoleId(ORG_ADMIN.getValue());
        assertErrorCode(this.requestPost(DEFAULT_LIST, request), GLOBAL_USER_ROLE_RELATION_SYSTEM_PERMISSION);

        // @@操作非全局用户组异常
        UserRole nonGlobalUserRole = getNonGlobalUserRole();
        request.setRoleId(nonGlobalUserRole.getId());
        assertErrorCode(this.requestPost(DEFAULT_LIST, request), GLOBAL_USER_ROLE_PERMISSION);

        // @@异常参数校验
        paramValidateTest(GlobalUserRoleRelationQueryRequestDefinition.class, DEFAULT_LIST);

        // @@校验权限
        requestPostPermissionTest(PermissionConstants.SYSTEM_USER_ROLE_READ, DEFAULT_LIST, request);
    }

    @Test
    @Order(0)
    void add() throws Exception {

        // 查询一条非内置用户组的数据
        UserRole nonInternalUserRole = getNonInternalUserRole();

        // @@请求成功
        GlobalUserRoleRelationUpdateRequest request = new GlobalUserRoleRelationUpdateRequest();
        request.setUserId(ADMIN.getValue());
        request.setRoleId(nonInternalUserRole.getId());
        this.requestPostWithOk(DEFAULT_ADD, request);
        UserRoleRelationExample example = new UserRoleRelationExample();
        example.createCriteria()
                .andRoleIdEqualTo(request.getRoleId())
                .andUserIdEqualTo(request.getUserId());
        Assertions.assertTrue(CollectionUtils.isNotEmpty(userRoleRelationMapper.selectByExample(example)));
        addUserRoleRelation = userRoleRelationMapper.selectByExample(example).get(0);

        // @@校验日志
        checkLog(addUserRoleRelation.getId(), OperationLogType.ADD);

        // @@重复添加校验
        request.setUserId(ADMIN.getValue());
        request.setRoleId(ADMIN.getValue());
        assertErrorCode(this.requestPost(DEFAULT_ADD, request), USER_ROLE_RELATION_EXIST);

        // @@操作非系统用户组异常
        request.setUserId(ADMIN.getValue());
        request.setRoleId(ORG_ADMIN.getValue());
        assertErrorCode(this.requestPost(DEFAULT_ADD, request), GLOBAL_USER_ROLE_RELATION_SYSTEM_PERMISSION);

        // @@操作非全局用户组异常
        UserRole nonGlobalUserRole = getNonGlobalUserRole();
        request.setUserId(ADMIN.getValue());
        request.setRoleId(nonGlobalUserRole.getId());
        assertErrorCode(this.requestPost(DEFAULT_ADD, request), GLOBAL_USER_ROLE_PERMISSION);

        // @@异常参数校验
        createdGroupParamValidateTest(GlobalUserRoleRelationUpdateRequestDefinition.class, DEFAULT_ADD);

        // @@校验权限
        requestPostPermissionTest(PermissionConstants.SYSTEM_USER_ROLE_UPDATE, DEFAULT_ADD, request);
    }

    @Test
    @Order(1)
    void delete() throws Exception {
        // @@请求成功
        this.requestGetWithOk(DEFAULT_DELETE, addUserRoleRelation.getId());
        UserRoleRelation userRoleRelation = userRoleRelationMapper.selectByPrimaryKey(addUserRoleRelation.getId());
        Assertions.assertNull(userRoleRelation);

        // @@校验日志
        checkLog(addUserRoleRelation.getId(), OperationLogType.DELETE);

        // @@操作非系统级别用户组异常
        assertErrorCode(this.requestGet(DEFAULT_DELETE, getNonSystemUserRoleRelation().getId()),
                GLOBAL_USER_ROLE_RELATION_SYSTEM_PERMISSION);

        // @@操作非全局用户组异常
        assertErrorCode(this.requestGet(DEFAULT_DELETE, getNonGlobalUserRoleRelation().getId()), GLOBAL_USER_ROLE_PERMISSION);

        // @@删除admin系统管理员用户组异常
        UserRoleRelationExample example = new UserRoleRelationExample();
        example.createCriteria()
                .andRoleIdEqualTo(ADMIN.getValue())
                .andUserIdEqualTo(ADMIN.getValue());
        List<UserRoleRelation> userRoleRelations = userRoleRelationMapper.selectByExample(example);
        assertErrorCode(this.requestGet(DEFAULT_DELETE, userRoleRelations.get(0).getId()),
               USER_ROLE_RELATION_REMOVE_ADMIN_USER_PERMISSION);

        // @@校验权限
        requestGetPermissionTest(PermissionConstants.SYSTEM_USER_ROLE_UPDATE, DEFAULT_DELETE, addUserRoleRelation.getId());
    }

    /**
     * 插入一条非内置用户组与用户的关联关系，并返回
     */
    private UserRoleRelation getNonGlobalUserRoleRelation() {
        UserRole nonGlobalUserRole = getNonGlobalUserRole();
        UserRoleRelation userRoleRelation = new UserRoleRelation();
        userRoleRelation.setId(UUID.randomUUID().toString());
        userRoleRelation.setRoleId(nonGlobalUserRole.getId());
        userRoleRelation.setCreateUser(ADMIN.getValue());
        userRoleRelation.setUserId(ADMIN.getValue());
        userRoleRelation.setCreateTime(System.currentTimeMillis());
        userRoleRelation.setSourceId(UUID.randomUUID().toString());
        userRoleRelationMapper.insert(userRoleRelation);
        return userRoleRelation;
    }

    /**
     * 插入一条非系统级别用户组与用户的关联关系，并返回
     */
    private UserRoleRelation getNonSystemUserRoleRelation() {
        UserRoleRelation userRoleRelation = new UserRoleRelation();
        userRoleRelation.setId(UUID.randomUUID().toString());
        userRoleRelation.setRoleId(ORG_ADMIN.getValue());
        userRoleRelation.setUserId(ADMIN.getValue());
        userRoleRelation.setCreateUser(ADMIN.getValue());
        userRoleRelation.setCreateTime(System.currentTimeMillis());
        userRoleRelation.setSourceId(UUID.randomUUID().toString());
        userRoleRelationMapper.insert(userRoleRelation);
        return userRoleRelation;
    }

    /**
     * 插入一条非全局用户组，并返回
     */
    private UserRole getNonGlobalUserRole() {
        // 插入一条非全局用户组数据
        UserRole nonGlobalUserRole = userRoleMapper.selectByPrimaryKey(ADMIN.getValue());
        nonGlobalUserRole.setName("非全局用户组");
        nonGlobalUserRole.setScopeId("not global");
        nonGlobalUserRole.setId(UUID.randomUUID().toString());
        userRoleMapper.insert(nonGlobalUserRole);
        return nonGlobalUserRole;
    }

    /**
     * 插入一条非内置的用户组数据，并返回
     */
    private UserRole getNonInternalUserRole() {
        // 插入一条用户组数据
        UserRole nonInternalRole = userRoleMapper.selectByPrimaryKey(ADMIN.getValue());
        nonInternalRole.setName("非内置用户组");
        nonInternalRole.setInternal(false);
        nonInternalRole.setId(UUID.randomUUID().toString());
        userRoleMapper.insert(nonInternalRole);
        return nonInternalRole;
    }
}