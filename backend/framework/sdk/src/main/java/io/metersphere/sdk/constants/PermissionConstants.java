package io.metersphere.sdk.constants;

/**
 * @author jianxing
 */
public class PermissionConstants {

    /*------ start: SYSTEM_USER_ROLE ------*/
    public static final String SYSTEM_USER_ROLE_READ = "SYSTEM_USER_ROLE:READ";
    public static final String SYSTEM_USER_ROLE_ADD = "SYSTEM_USER_ROLE:READ+ADD";
    public static final String SYSTEM_USER_ROLE_UPDATE = "SYSTEM_USER_ROLE:READ+UPDATE";
    public static final String SYSTEM_USER_ROLE_DELETE = "SYSTEM_USER_ROLE:READ+DELETE";
    /*------ end: SYSTEM_USER_ROLE ------*/

    /*------ start: SYSTEM_USER_ROLE_RELATION ------*/
    public static final String SYSTEM_USER_ROLE_RELATION_READ = "SYSTEM_USER_ROLE_RELATION_READ:READ";
    public static final String SYSTEM_USER_ROLE_RELATION_ADD = "SYSTEM_USER_ROLE_RELATION_READ:READ+ADD";
    public static final String SYSTEM_USER_ROLE_RELATION_UPDATE = "SYSTEM_USER_ROLE_RELATION_READ:READ+UPDATE";
    public static final String SYSTEM_USER_ROLE_RELATION_DELETE = "SYSTEM_USER_ROLE_RELATION_READ:READ+DELETE";
    /*------ end: SYSTEM_USER_ROLE_RELATION ------*/

    public static final String SYSTEM_USER_READ = "SYSTEM_USER:READ";
    public static final String SYSTEM_USER_READ_ADD = "SYSTEM_USER:READ+ADD";
    public static final String SYSTEM_USER_READ_IMPORT = "SYSTEM_USER:READ+IMPORT";
    public static final String SYSTEM_USER_READ_UPDATE = "SYSTEM_USER:READ+UPDATE";
    public static final String SYSTEM_USER_READ_DELETE = "SYSTEM_USER:READ+DELETE";
    public static final String SYSTEM_USER_READ_UPDATE_PASSWORD = "SYSTEM_USER:READ+UPDATE_PASSWORD";

    public static final String SYSTEM_ORGANIZATION_PROJECT_READ = "SYSTEM_ORGANIZATION_PROJECT:READ";
    public static final String SYSTEM_ORGANIZATION_PROJECT_READ_ADD = "SYSTEM_ORGANIZATION_PROJECT:READ+ADD";
    public static final String SYSTEM_ORGANIZATION_PROJECT_READ_UPDATE = "SYSTEM_ORGANIZATION_PROJECT:READ+UPDATE";
    public static final String SYSTEM_ORGANIZATION_PROJECT_READ_DELETE = "SYSTEM_ORGANIZATION_PROJECT:READ+DELETE";
    public static final String SYSTEM_ORGANIZATION_PROJECT_READ_RECOVER = "SYSTEM_ORGANIZATION_PROJECT:READ+RECOVER";

    public static final String SYSTEM_TEST_RESOURCE_POOL_READ = "SYSTEM_TEST_RESOURCE_POOL:READ";
    public static final String SYSTEM_TEST_RESOURCE_POOL_READ_ADD = "SYSTEM_TEST_RESOURCE_POOL:READ+ADD";
    public static final String SYSTEM_TEST_RESOURCE_POOL_READ_UPDATE = "SYSTEM_TEST_RESOURCE_POOL:READ+UPDATE";
    public static final String SYSTEM_TEST_RESOURCE_POOL_READ_DELETE = "SYSTEM_TEST_RESOURCE_POOL:READ+DELETE";

    public static final String SYSTEM_GROUP_READ = "SYSTEM_GROUP:READ";
    public static final String SYSTEM_GROUP_READ_ADD = "SYSTEM_GROUP:READ+ADD";
    public static final String SYSTEM_GROUP_READ_UPDATE = "SYSTEM_GROUP:READ+UPDATE";
    public static final String SYSTEM_GROUP_READ_SETTING_PERMISSION = "SYSTEM_GROUP:READ+SETTING_PERMISSION";
    public static final String SYSTEM_GROUP_READ_DELETE = "SYSTEM_GROUP:READ+DELETE";

    public static final String SYSTEM_SETTING_READ = "SYSTEM_SETTING:READ";
    public static final String SYSTEM_SETTING_READ_UPDATE = "SYSTEM_SETTING:READ+UPDATE";
    public static final String SYSTEM_SETTING_READ_CREAT = "SYSTEM_SETTING:READ+CREAT";
    public static final String SYSTEM_SETTING_READ_DELETE = "SYSTEM_SETTING:READ+DELETE";
    public static final String SYSTEM_SETTING_READ_AUTH_MANAGE = "SYSTEM_SETTING:READ+AUTH_MANAGE";
    public static final String SYSTEM_QUOTA_READ = "SYSTEM_QUOTA:READ";
    public static final String SYSTEM_QUOTA_READ_UPDATE = "SYSTEM_QUOTA:READ+UPDATE";
    public static final String SYSTEM_AUTH_READ = "SYSTEM_AUTH:READ";
    public static final String SYSTEM_AUTH_READ_UPDATE = "SYSTEM_AUTH:READ+UPDATE";

    public static final String SYSTEM_OPERATING_LOG_READ = "SYSTEM_OPERATING_LOG:READ";

    public static final String ORGANIZATION_SERVICE_READ = "ORGANIZATION_SERVICE:READ";
    public static final String ORGANIZATION_SERVICE_READ_UPDATE = "ORGANIZATION_SERVICE:READ+UPDATE";

    public static final String ORGANIZATION_USER_READ = "ORGANIZATION_USER:READ";
    public static final String ORGANIZATION_USER_READ_ADD = "ORGANIZATION_USER:READ+ADD";
    public static final String ORGANIZATION_USER_READ_UPDATE = "ORGANIZATION_USER:READ+UPDATE";
    public static final String ORGANIZATION_USER_READ_DELETE = "ORGANIZATION_USER:READ+DELETE";

    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ = "ORGANIZATION_PROJECT_ENVIRONMENT:READ";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_ADD = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+ADD";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_UPDATE = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+UPDATE";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_DELETE = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+DELETE";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_COPY = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+COPY";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_IMPORT = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+IMPORT";
    public static final String ORGANIZATION_PROJECT_ENVIRONMENT_READ_EXPORT = "ORGANIZATION_PROJECT_ENVIRONMENT:READ+EXPORT";

    public static final String ORGANIZATION_OPERATING_LOG_READ = "ORGANIZATION_OPERATING_LOG:READ";

    public static final String PROJECT_USER_READ = "PROJECT_USER:READ";
    public static final String PROJECT_USER_READ_ADD = "PROJECT_USER:READ+ADD";
    public static final String PROJECT_USER_READ_UPDATE = "PROJECT_USER:READ+UPDATE";
    public static final String PROJECT_USER_READ_DELETE = "PROJECT_USER:READ+DELETE";

    public static final String PROJECT_MANAGER_READ = "PROJECT_MANAGER:READ";
    public static final String PROJECT_MANAGER_READ_ADD = "PROJECT_MANAGER:READ+ADD";
    public static final String PROJECT_MANAGER_READ_UPDATE = "PROJECT_MANAGER:READ+UPDATE";
    public static final String PROJECT_MANAGER_READ_DELETE = "PROJECT_MANAGER:READ+DELETE";

    public static final String PROJECT_GROUP_READ = "PROJECT_GROUP:READ";
    public static final String PROJECT_GROUP_READ_ADD = "PROJECT_GROUP:READ+ADD";
    public static final String PROJECT_GROUP_READ_UPDATE = "PROJECT_GROUP:READ+UPDATE";
    public static final String PROJECT_GROUP_READ_DELETE = "PROJECT_GROUP:READ+DELETE";
    public static final String PROJECT_GROUP_READ_SETTING_PERMISSION = "PROJECT_GROUP:READ+SETTING_PERMISSION";

    public static final String PROJECT_ENVIRONMENT_READ = "PROJECT_ENVIRONMENT:READ";
    public static final String PROJECT_ENVIRONMENT_READ_ADD = "PROJECT_ENVIRONMENT:READ+ADD";
    public static final String PROJECT_ENVIRONMENT_READ_UPDATE = "PROJECT_ENVIRONMENT:READ+UPDATE";
    public static final String PROJECT_ENVIRONMENT_READ_DELETE = "PROJECT_ENVIRONMENT:READ+DELETE";
    public static final String PROJECT_ENVIRONMENT_READ_COPY = "PROJECT_ENVIRONMENT:READ+COPY";
    public static final String PROJECT_ENVIRONMENT_READ_IMPORT = "PROJECT_ENVIRONMENT:READ+IMPORT";
    public static final String PROJECT_ENVIRONMENT_READ_EXPORT = "PROJECT_ENVIRONMENT:READ+EXPORT";

    public static final String PROJECT_OPERATING_LOG_READ = "PROJECT_OPERATING_LOG:READ";

    public static final String PROJECT_TRACK_CASE_READ = "PROJECT_TRACK_CASE:READ";
    public static final String PROJECT_TRACK_CASE_READ_ADD = "PROJECT_TRACK_CASE:READ+ADD";
    public static final String PROJECT_TRACK_CASE_READ_UPDATE = "PROJECT_TRACK_CASE:READ+UPDATE";
    public static final String PROJECT_TRACK_CASE_READ_DELETE = "PROJECT_TRACK_CASE:READ+DELETE";
    public static final String PROJECT_TRACK_CASE_MINDER_OPERATE = "PROJECT_TRACK_CASE_MINDER:OPERATE";
    public static final String PROJECT_TRACK_CASE_READ_COPY = "PROJECT_TRACK_CASE:READ+COPY";
    public static final String PROJECT_TRACK_CASE_READ_IMPORT = "PROJECT_TRACK_CASE:READ+IMPORT";
    public static final String PROJECT_TRACK_CASE_READ_EXPORT = "PROJECT_TRACK_CASE:READ+EXPORT";

    public static final String PROJECT_TRACK_REVIEW_READ = "PROJECT_TRACK_REVIEW:READ";
    public static final String PROJECT_TRACK_REVIEW_READ_ADD = "PROJECT_TRACK_REVIEW:READ+ADD";
    public static final String PROJECT_TRACK_REVIEW_READ_UPDATE = "PROJECT_TRACK_REVIEW:READ+UPDATE";
    public static final String PROJECT_TRACK_REVIEW_READ_DELETE = "PROJECT_TRACK_REVIEW:READ+DELETE";
    public static final String PROJECT_TRACK_REVIEW_READ_COMMENT = "PROJECT_TRACK_REVIEW:READ+COMMENT";
    public static final String PROJECT_TRACK_REVIEW_READ_RELEVANCE_OR_CANCEL = "PROJECT_TRACK_REVIEW:READ+RELEVANCE_OR_CANCEL";

    public static final String PROJECT_TRACK_PLAN_READ = "PROJECT_TRACK_PLAN:READ";
    public static final String PROJECT_TRACK_PLAN_READ_ADD = "PROJECT_TRACK_PLAN:READ+ADD";
    public static final String PROJECT_TRACK_PLAN_READ_UPDATE = "PROJECT_TRACK_PLAN:READ+UPDATE";
    public static final String PROJECT_TRACK_PLAN_READ_DELETE = "PROJECT_TRACK_PLAN:READ+DELETE";
    public static final String PROJECT_TRACK_PLAN_READ_BATCH_DELETE = "PROJECT_TRACK_PLAN:READ+BATCH_DELETE";
    public static final String PROJECT_TRACK_PLAN_READ_SCHEDULE = "PROJECT_TRACK_PLAN:READ+SCHEDULE";
    public static final String PROJECT_TRACK_PLAN_READ_RELEVANCE_OR_CANCEL = "PROJECT_TRACK_PLAN:READ+RELEVANCE_OR_CANCEL";
    public static final String PROJECT_TRACK_PLAN_READ_RUN = "PROJECT_TRACK_PLAN:READ+RUN";

    public static final String PROJECT_TRACK_ISSUE_READ = "PROJECT_TRACK_ISSUE:READ";
    public static final String PROJECT_TRACK_ISSUE_READ_ADD = "PROJECT_TRACK_ISSUE:READ+ADD";
    public static final String PROJECT_TRACK_ISSUE_READ_UPDATE = "PROJECT_TRACK_ISSUE:READ+UPDATE";
    public static final String PROJECT_TRACK_ISSUE_READ_DELETE = "PROJECT_TRACK_ISSUE:READ+DELETE";

    public static final String PROJECT_TRACK_REPORT_READ = "PROJECT_TRACK_REPORT:READ";
    public static final String PROJECT_TRACK_REPORT_READ_DELETE = "PROJECT_TRACK_REPORT:READ+DELETE";
    public static final String PROJECT_TRACK_REPORT_READ_UPDATE = "PROJECT_TRACK_REPORT:READ+UPDATE";
    public static final String PROJECT_TRACK_REPORT_READ_EXPORT = "PROJECT_TRACK_REPORT:READ+EXPORT";

    public static final String PROJECT_API_DEFINITION_READ = "PROJECT_API_DEFINITION:READ";
    public static final String PROJECT_API_DEFINITION_READ_ADD_API = "PROJECT_API_DEFINITION:READ+ADD_API";
    public static final String PROJECT_API_DEFINITION_READ_UPDATE_API = "PROJECT_API_DEFINITION:READ+UPDATE_API";
    public static final String PROJECT_API_DEFINITION_READ_DELETE_API = "PROJECT_API_DEFINITION:READ+DELETE_API";
    public static final String PROJECT_API_DEFINITION_READ_COPY_API = "PROJECT_API_DEFINITION:READ+COPY_API";
    public static final String PROJECT_API_DEFINITION_READ_ADD_CASE = "PROJECT_API_DEFINITION:READ+ADD_CASE";
    public static final String PROJECT_API_DEFINITION_READ_UPDATE_CASE = "PROJECT_API_DEFINITION:READ+UPDATE_CASE";
    public static final String PROJECT_API_DEFINITION_READ_DELETE_CASE = "PROJECT_API_DEFINITION:READ+DELETE_CASE";
    public static final String PROJECT_API_DEFINITION_READ_COPY_CASE = "PROJECT_API_DEFINITION:READ+COPY_CASE";
    public static final String PROJECT_API_DEFINITION_READ_IMPORT_API = "PROJECT_API_DEFINITION:READ+IMPORT_API";
    public static final String PROJECT_API_DEFINITION_READ_EXPORT_API = "PROJECT_API_DEFINITION:READ+EXPORT_API";
    public static final String PROJECT_API_DEFINITION_READ_ADD_PERFORMANCE = "PROJECT_API_DEFINITION:READ+ADD_PERFORMANCE";
    public static final String PROJECT_API_DEFINITION_READ_RUN = "PROJECT_API_DEFINITION:READ+RUN";
    public static final String PROJECT_API_DEFINITION_READ_DEBUG = "PROJECT_API_DEFINITION:READ+DEBUG";
    public static final String PROJECT_API_DEFINITION_READ_MOCK = "PROJECT_API_DEFINITION:READ+MOCK";

    public static final String PROJECT_API_SCENARIO_READ = "PROJECT_API_SCENARIO:READ";
    public static final String PROJECT_API_SCENARIO_READ_ADD = "PROJECT_API_SCENARIO:READ+ADD";
    public static final String PROJECT_API_SCENARIO_READ_UPDATE = "PROJECT_API_SCENARIO:READ+UPDATE";
    public static final String PROJECT_API_SCENARIO_READ_DELETE = "PROJECT_API_SCENARIO:READ+DELETE";
    public static final String PROJECT_API_SCENARIO_READ_COPY = "PROJECT_API_SCENARIO:READ+COPY";
    public static final String PROJECT_API_SCENARIO_READ_RUN = "PROJECT_API_SCENARIO:READ+RUN";
    public static final String PROJECT_API_SCENARIO_READ_DEBUG = "PROJECT_API_SCENARIO:READ+DEBUG";
    public static final String PROJECT_API_SCENARIO_READ_SCHEDULE = "PROJECT_API_SCENARIO:READ+SCHEDULE";
    public static final String PROJECT_API_SCENARIO_READ_IMPORT_SCENARIO = "PROJECT_API_SCENARIO:READ+IMPORT_SCENARIO";
    public static final String PROJECT_API_SCENARIO_READ_EXPORT_SCENARIO = "PROJECT_API_SCENARIO:READ+EXPORT_SCENARIO";
    public static final String PROJECT_API_SCENARIO_READ_MOVE_BATCH = "PROJECT_API_SCENARIO:READ+MOVE_BATCH";
    public static final String PROJECT_API_SCENARIO_READ_ADD_PERFORMANCE = "PROJECT_API_SCENARIO:READ+ADD_PERFORMANCE";

    public static final String PROJECT_UI_SCENARIO_READ = "PROJECT_UI_SCENARIO:READ";
    public static final String PROJECT_UI_SCENARIO_READ_ADD = "PROJECT_UI_SCENARIO:READ+ADD";
    public static final String PROJECT_UI_SCENARIO_READ_UPDATE = "PROJECT_UI_SCENARIO:READ+UPDATE";
    public static final String PROJECT_UI_SCENARIO_READ_DELETE = "PROJECT_UI_SCENARIO:READ+DELETE";
    public static final String PROJECT_UI_REPORT_READ_DELETE = "PROJECT_UI_REPORT:READ+DELETE";

    public static final String PROJECT_UI_SCENARIO_READ_COPY = "PROJECT_UI_SCENARIO:READ+COPY";
    public static final String PROJECT_UI_SCENARIO_READ_RUN = "PROJECT_UI_SCENARIO:READ+RUN";
    public static final String PROJECT_UI_SCENARIO_READ_DEBUG = "PROJECT_UI_SCENARIO:READ+DEBUG";
    public static final String PROJECT_UI_SCENARIO_READ_SCHEDULE = "PROJECT_UI_SCENARIO:READ+SCHEDULE";
    public static final String PROJECT_UI_SCENARIO_READ_IMPORT_SCENARIO = "PROJECT_UI_SCENARIO:READ+IMPORT_SCENARIO";
    public static final String PROJECT_UI_SCENARIO_READ_EXPORT_SCENARIO = "PROJECT_UI_SCENARIO:READ+EXPORT_SCENARIO";
    public static final String PROJECT_UI_SCENARIO_READ_MOVE_BATCH = "PROJECT_UI_SCENARIO:READ+MOVE_BATCH";
    public static final String PROJECT_UI_SCENARIO_READ_ADD_PERFORMANCE = "PROJECT_UI_SCENARIO:READ+ADD_PERFORMANCE";

    public static final String PROJECT_UI_ELEMENT_READ = "PROJECT_UI_SCENARIO:READ";
    public static final String PROJECT_UI_ELEMENT_READ_ADD = "PROJECT_UI_SCENARIO:READ+ADD";
    public static final String PROJECT_UI_ELEMENT_READ_UPDATE = "PROJECT_UI_SCENARIO:READ+UPDATE";
    public static final String PROJECT_UI_ELEMENT_READ_DELETE = "PROJECT_UI_SCENARIO:READ+DELETE";

    public static final String PROJECT_API_REPORT_READ = "PROJECT_API_REPORT:READ";
    public static final String PROJECT_API_REPORT_READ_DELETE = "PROJECT_API_REPORT:READ+DELETE";
    public static final String PROJECT_API_REPORT_READ_EXPORT = "PROJECT_API_REPORT:READ+EXPORT";

    public static final String PROJECT_PERFORMANCE_TEST_READ = "PROJECT_PERFORMANCE_TEST:READ";
    public static final String PROJECT_PERFORMANCE_TEST_READ_ADD = "PROJECT_PERFORMANCE_TEST:READ+ADD";
    public static final String PROJECT_PERFORMANCE_TEST_READ_UPDATE = "PROJECT_PERFORMANCE_TEST:READ+UPDATE";
    public static final String PROJECT_PERFORMANCE_TEST_READ_DELETE = "PROJECT_PERFORMANCE_TEST:READ+DELETE";
    public static final String PROJECT_PERFORMANCE_TEST_READ_COPY = "PROJECT_PERFORMANCE_TEST:READ+COPY";
    public static final String PROJECT_PERFORMANCE_TEST_READ_RUN = "PROJECT_PERFORMANCE_TEST:READ+RUN";
    public static final String PROJECT_PERFORMANCE_TEST_READ_SCHEDULE = "PROJECT_PERFORMANCE_TEST:READ+SCHEDULE";

    public static final String PROJECT_PERFORMANCE_REPORT_READ = "PROJECT_PERFORMANCE_REPORT:READ";
    public static final String PROJECT_PERFORMANCE_REPORT_READ_DELETE = "PROJECT_PERFORMANCE_REPORT:READ+DELETE";
    public static final String PROJECT_PERFORMANCE_REPORT_READ_EXPORT = "PROJECT_PERFORMANCE_REPORT:READ+EXPORT";

    public static final String PROJECT_ENTERPRISE_REPORT_EXPORT = "PROJECT_ENTERPRISE_REPORT:READ+EXPORT";
    public static final String PROJECT_ENTERPRISE_REPORT_ADD = "PROJECT_ENTERPRISE_REPORT:READ+ADD";
    public static final String PROJECT_ENTERPRISE_REPORT_UPDATE = "PROJECT_ENTERPRISE_REPORT:READ+UPDATE";
    public static final String PROJECT_ENTERPRISE_REPORT_DELETE = "PROJECT_ENTERPRISE_REPORT:READ+DELETE";
    public static final String PROJECT_ENTERPRISE_REPORT_COPY = "PROJECT_ENTERPRISE_REPORT:READ+COPY";
    public static final String PROJECT_ENTERPRISE_REPORT_SCHEDULE = "PROJECT_ENTERPRISE_REPORT:READ+SCHEDULE";

    public static final String PROJECT_ERROR_REPORT_LIBRARY_EXPORT = "PROJECT_ERROR_REPORT_LIBRARY:READ+EXPORT";
    public static final String PROJECT_ERROR_REPORT_LIBRARY_ADD = "PROJECT_ERROR_REPORT_LIBRARY:READ+ADD";
    public static final String PROJECT_ERROR_REPORT_LIBRARY_UPDATE = "PROJECT_ERROR_REPORT_LIBRARY:READ+UPDATE";
    public static final String PROJECT_ERROR_REPORT_LIBRARY_DELETE = "PROJECT_ERROR_REPORT_LIBRARY:READ+DELETE";
    public static final String PROJECT_ERROR_REPORT_LIBRARY_COPY = "PROJECT_ERROR_REPORT_LIBRARY:READ+COPY";
    public static final String PROJECT_ERROR_REPORT_LIBRARY_SCHEDULE = "PROJECT_ERROR_REPORT_LIBRARY:READ+SCHEDULE";

    public static final String PROJECT_MESSAGE_READ = "PROJECT_MESSAGE:READ";
    public static final String PROJECT_MESSAGE_READ_UPDATE = "PROJECT_MESSAGE:READ+UPDATE";
    public static final String PROJECT_TEMPLATE_READ = "PROJECT_TEMPLATE:READ";
    public static final String PROJECT_TEMPLATE_READ_CASE_TEMPLATE = "PROJECT_TEMPLATE:READ+CASE_TEMPLATE";
    public static final String PROJECT_TEMPLATE_READ_ISSUE_TEMPLATE = "PROJECT_TEMPLATE:READ+ISSUE_TEMPLATE";
    public static final String PROJECT_TEMPLATE_READ_API_TEMPLATE = "PROJECT_TEMPLATE:READ+API_TEMPLATE";
    public static final String PROJECT_TEMPLATE_READ_CUSTOM = "PROJECT_TEMPLATE:READ+CUSTOM";
    public static final String PROJECT_TEMPLATE_READ_REPORT_TEMPLATE = "PROJECT_TEMPLATE:READ+REPORT_TEMPLATE";
}
