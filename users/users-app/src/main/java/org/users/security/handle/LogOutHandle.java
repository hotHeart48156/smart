package org.users.security.handle;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;


/**
 * @author "yangbiao"
 * @create 2019122317:13
 */
public class LogOutHandle implements LogOut {
    @Override
    public void logout(@NotNull(message = "request required") HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

        HttpSession session = request.getSession(false);
        SecurityContextHolder.clearContext();

    }
}
