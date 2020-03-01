package org.users.security.handle.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @author "yangbiao"
 * @date 2019122322:21
 */
//用来解决认证过的用户访问无权限资源时的异常
public class AccessDeniedHandle implements AccessDenied {
    @Autowired
    private ObjectMapper mapper;

    public static boolean isAjaxRequest(HttpServletRequest request) {
        String ajaxFlag = request.getHeader("X-Requested-With");
        return ajaxFlag != null && "XMLHttpRequest".equals(ajaxFlag);
    }

    @Override
    public AccessDeniedHandler deniedHandler() {
        return new AccessDeniedHandler() {
            @Override
            public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
                httpServletResponse.setContentType("application/json;charset=UTF-8");
                Map<String, Object> map = new HashMap<>();
                map.put("error", "403");
                map.put("error", "403");
                map.put("message", e.getMessage());
                map.put("path", httpServletRequest.getServletPath());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                httpServletResponse.setContentType("application/json");
                httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
                httpServletResponse.getWriter().write(mapper.writeValueAsString(map));

                /**
                 *   response.setCharacterEncoding("utf-8");
                 *         response.setContentType("text/javascript;charset=utf-8");
                 *         response.getWriter().print(JSONObject.toJSONString(RestMsg.error("没有访问权限!")));
                 *
                 */
            }
        };
    }
}
