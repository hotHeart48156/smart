package com.smart.website.security.spring.manage;

import org.springframework.security.access.AccessDecisionManager;

/**
 * @author "yangbiao"
 * @create 2019122320:25
 */
public interface AccessDecisionManage {
    AccessDecisionManager decide();
}
