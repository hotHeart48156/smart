package org.account.security.entrypoint;

import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @author "yangbiao"
 * @create 201912230:23
 */
public interface EntryPoint {
    AuthenticationEntryPoint commence();
}
