package com.july.springboot.util;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Map;

/**
 */
public class MDCUtil {
    /**
     * 用户名
     */
    public static final String MDC_USER_ID = "userId";
    /**
     * 请求事物ID
     */
    public static final String MDC_TRANSACTION_ID = "transactionId";
    /**
     * 角色
     */
    public static final String MDC_ROLE_LIST = "roleList";
    private static final Logger LOGGER = LoggerFactory.getLogger(MDCUtil.class);
    /**
     * 请求ID的前缀长度
     */
    private static final int REQUEST_ID_PREFIX_LENGTH = 10;

    private MDCUtil() {
    }

    /**
     * 获取请求事物ID
     *
     * @return
     */
    public static String getTransactionId() {
        return MDC.get(MDC_TRANSACTION_ID);
    }

    /**
     * 设置请求事物ID
     *
     * @param transactionId
     */
    public static void setTransactionId(String transactionId) {
        MDC.put(MDC_TRANSACTION_ID, transactionId);
    }

    /**
     * 获取请求用户名
     *
     * @return
     */
    public static String getUserId() {
        return MDC.get(MDC_USER_ID);
    }

    /**
     * 设置请求用户名
     *
     * @param userId
     */
    public static void setUserId(String userId) {
        MDC.put(MDC_USER_ID, userId);
    }

    /**
     * 获取请求用的角色
     *
     * @return
     */
    public static String getRoleList() {
        return MDC.get(MDC_ROLE_LIST);
    }

    /**
     * 设置请求用户的角色
     *
     * @param roleList
     */
    public static void setRoleList(String roleList) {
        MDC.put(MDC_ROLE_LIST, roleList);
    }

    /**
     * 生成请求事物ID
     *
     * @return
     */
    public static String generateTransactionId() {
        return String.valueOf(System.currentTimeMillis() + RandomUtils.nextInt(10000, 1000000));
    }

    /**
     * 获取MDC封装实体
     *
     * @return
     */
    public static MDCInfo getMDCInfo() {
        return new MDCInfo(MDC.getCopyOfContextMap());
    }

    /**
     * 设置mdcInfo
     *
     * @param mdcInfo
     */
    public static void setMDCInfo(MDCInfo mdcInfo) {
        Map<String, String> contextMap = MDC.getCopyOfContextMap();

        if (contextMap == null) {
            contextMap = mdcInfo.getContextMap();
        } else {
            contextMap.putAll(mdcInfo.getContextMap());
        }

        MDC.setContextMap(contextMap);
    }

    /**
     * MDC封装实体
     */
    public static final class MDCInfo {

        /**
         * MDC 内容MAP
         */
        private Map<String, String> contextMap;

        public MDCInfo(Map<String, String> contextMap) {
            this.contextMap = contextMap;
        }

        public Map<String, String> getContextMap() {
            return contextMap;
        }

        public void setContextMap(Map<String, String> contextMap) {
            this.contextMap = contextMap;
        }
    }
}
