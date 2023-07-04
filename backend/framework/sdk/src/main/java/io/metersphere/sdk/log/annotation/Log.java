package io.metersphere.sdk.log.annotation;

import io.metersphere.sdk.log.constants.OperationLogModule;
import io.metersphere.sdk.log.constants.OperationLogType;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * 操作日志注解类
 * @author mr.zhao
 */
public @interface Log {
    /**
     * 功能模块
     *
     * @return
     */
    String module() default OperationLogModule.UNKNOWN_MODULE;

    /**
     * 项目，系统模块没有项目id默认系统
     *
     * @return
     */
    String projectId() default "system";

    /**
     * 操作类型
     *
     * @return
     */
    OperationLogType type() default OperationLogType.SELECT;

    /**
     * 资源ID
     */
    String sourceId() default "NONE";

    /**
     * 创建用户
     *
     * @return
     */
    String createUser() default "admin";

    /**
     * 操作内容
     *
     * @return
     */
    String details() default "";

    /**
     * 是否是批量删除操作
     *
     * @return
     */
    boolean isBatch() default false;

    /**
     * 是否在业务代码执行前记录内容
     *
     * @return
     */
    boolean isBefore() default false;

    /**
     * 传入执行类
     *
     * @return
     */
    Class[] msClass() default {};
}