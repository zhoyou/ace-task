package com.github.hollykunge.security.common.constant;

import org.tio.utils.time.Time;

/**
 *
 * @author 协同设计小组
 * @date 2017/8/29
 */
public class CommonConstants {
    public final static String RESOURCE_TYPE_MENU = "menu";
    public final static String RESOURCE_TYPE_BTN = "button";
    // 用户token异常
    public static final Integer EX_USER_INVALID_CODE = 40101;
    // 客户端token异常
    public static final Integer EX_CLIENT_INVALID_CODE = 40301;
    public static final Integer EX_CLIENT_FORBIDDEN_CODE = 40331;
    public static final Integer EX_OTHER_CODE = 500;
    public static final Integer HTTP_SUCCESS = 200;
    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_USERNAME = "currentUserName";
    public static final String CONTEXT_KEY_USER_NAME = "currentUser";
    public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";
    public static final String JWT_KEY_USER_ID = "userId";
    public static final String JWT_KEY_NAME = "name";
    //adminUser默认密码
    public static final String ADMIN_PASSWORD = "$2a$12$0pS6RoQtr2ASZyhpdUwmvO/VPBdYu.S.BFASQiJVo0ZblGrlqmABm";
    /** 公告通知交换机名称*/
    public static final String NOTICE_EXCHANGE = "noticeExchange";
    /** 公告队列名称 */
    public static final String NOTICE_QUEUE_NAMA = "noticeQueue";
    /**
     * 公告推送到研讨服务队列名称
     */
    public static final String NOTICE_TOWECHAT_QUEUE_NAMA = "noticeToChatService";
    /**
     * 通知公告发送到门户服务路由键
     */
    public static final String NOTICE_TOPORTAL_ROTEING_KEY = "notic_to_portal";
    /**
     * 通知公告发送到研讨服务路由键
     */
    public static final String NOTICE_TOCHAT_ROTEING_KEY = "notic_to_chat";
    /**
     * 通知死信队列名称
     */
    public final static String NOTICE_DEAD_QUEUENAME = "notic_dead_queue";

    /**
     * ADMIN组织用户交换机名称
     */
    public final static String WERSERVICE_ADMIN_USERANDORG_EXCHANGE = "webAdminUserAndOrgExchange";

    /**
     * 用户队列名称
     */
    public final static String ADMINUSER_QUEUE_NAME = "adminUserQueue";
    /**
     * 组织队列名称
     */
    public final static String ADMINORG_QUEUE_NAME = "adminOrgQueue";
    /**
     * 用户路由键
     */
    public static final String ADMINUSER_ROTEING_KEY = "admin_user";
    /**
     * 组织路由键
     */
    public static final String ADMINORG_ROTEING_KEY = "admin_org";

    /** tio用ip数据监控统计，时间段*/
    public static final Long DURATION_1 = Time.MINUTE_1 * 5;
    public static final Long[] IPSTAT_DURATIONS = new Long[]{DURATION_1};

    //密级判断
    public static final Integer EX_LEVELS = 40000;

    public static final String WEB_USERHOST = "userHost";
    public static final String WEB_USERNAME = "userName";
    public static final String WEB_USERID = "userId";
    /**
     * 院网关身份姓名
     */
    public static final String PERSON_ID_ARG = "dnname";
    public static final String CLIENT_IP_ARG = "clientIp";
    /**
     * 院网关解码
     */
    public static final String PERSON_CHAR_SET = "ISO8859-1";


    /**
     * 未消费掉的人员或组织使用的交换机
     */
    public static final String ADMIN_USERORORG_EXCHANGE = "adminUserAndOrgExchange";
    /**
     * admin服务中人员未被消费队列
     */
    public static final String ADMIN_UNACK_USER = "admin_unack_user_queue";
    /**
     * 路由键
     */
    public static final String ADMIN_UNACK_USER_KEY = "admin_unack_user_key";
    /**
     * admin服务中组织未被的队列
     */
    public static final String ADMIN_UNACK_ORG = "admin_unack_org_queue";
    /**
     * 路由键
     */
    public static final String ADMIN_UNACK_ORG_KEY = "admin_unack_org_key";

    public static final String GATE_LOG_REQUEST_BODY_PARAMS  = "requestBodyParam";
    /**
     * 获取请求体中的参数名，按顺序获取如果没有第一个，则第二个，以此类推
     */
    public static final String GET_GATE_LOG_REQUEST_BODY_RULE = "name,title";

    public static final String GATE_REQUEST_URI = "requestUri";

    public static final String GET_GATE_LOG_REQUEST_LIST = "all";

    public static final String GET_GATE_LOG_REQUEST_PAGE = "page";

    public static final String GET_GATE_LOG_REQUEST_EXPORT = "export";
    public static final String GET_GATE_LOG_REQUEST_FEIGN = "/front/info";

}
