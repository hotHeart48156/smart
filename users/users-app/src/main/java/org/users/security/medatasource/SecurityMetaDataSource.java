package org.users.security.medatasource;

import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

/**
 * @author "yangbiao"
 * @create 2019122320:41
 */
public interface SecurityMetaDataSource {
    FilterInvocationSecurityMetadataSource SecurityMetadataSource();
}
