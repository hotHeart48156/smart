package org.users.security.handle;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author "yangbiao"
 * @create 2019122317:11
 */
public interface LogOut {
    void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication);
}
