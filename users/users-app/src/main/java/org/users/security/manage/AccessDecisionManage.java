package org.users.security.manage;

import org.springframework.security.access.AccessDecisionManager;

/**
 * @author "yangbiao"
 * @create 2019122320:25
 */
public interface AccessDecisionManage {
    AccessDecisionManager decide();
}
