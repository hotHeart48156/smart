package org.users.security.entrypoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author "yangbiao"
 * @date 2019122323:01
 */
//用来解决匿名用户访问无权限资源时的异常,它在用户请求处理过程中遇到认证异常时，
// 被ExceptionTranslationFilter用于开启特定认证方案(authentication schema)的认证流程。

/**
 * 内置实现
 * Http403ForbiddenEntryPoint
 * <p>
 * 设置响应状态字为403,并非触发一个真正的认证流程。通常在一个预验证(pre-authenticated authentication)已经得出结论需要拒绝用户请求的情况被用于拒绝用户请求。
 * <p>
 * <p>
 * HttpStatusEntryPoint
 * <p>
 * 设置特定的响应状态字，并非触发一个真正的认证流程。
 * <p>
 * <p>
 * LoginUrlAuthenticationEntryPoint
 * <p>
 * 根据配置计算出登录页面url,将用户重定向到该登录页面从而开始一个认证流程。
 * <p>
 * <p>
 * BasicAuthenticationEntryPoint
 * <p>
 * 对应标准Http Basic认证流程的触发动作，向响应写入状态字401和头部WWW-Authenticate:"Basic realm="xxx"触发标准Http Basic认证流程。
 * <p>
 * <p>
 * DigestAuthenticationEntryPoint
 * <p>
 * 对应标准Http Digest认证流程的触发动作，向响应写入状态字401和头部WWW-Authenticate:"Digest realm="xxx"触发标准Http Digest认证流程。
 * <p>
 * <p>
 * DelegatingAuthenticationEntryPoint
 * <p>
 * 这是一个代理，将认证任务委托给所代理的多个AuthenticationEntryPoint对象，其中一个被标记为缺省AuthenticationEntryPoint。
 */
public class AuthEntryPoint implements EntryPoint {
    @Autowired
    AuthenticationException authException;


    public static boolean isAjaxRequest(HttpServletRequest request) {
        String ajaxFlag = request.getHeader("X-Requested-With");
        return ajaxFlag != null && "XMLHttpRequest".equals(ajaxFlag);
    }

    @Override
    public AuthenticationEntryPoint commence() {
        AuthenticationEntryPoint entryPoint = new AuthenticationEntryPoint() {
            @Override
            public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                Map<String, Object> map = new HashMap<>();
                map.put("error", "401");
                map.put("message", authException.getMessage());
                map.put("path", httpServletRequest.getServletPath());
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                httpServletResponse.setContentType("application/json");
                httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    mapper.writeValue(httpServletResponse.getOutputStream(), map);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

/**
 *   response.setCharacterEncoding("utf-8");
 *         response.setContentType("text/javascript;charset=utf-8");
 *         response.getWriter().print(JSONObject.toJSONString(RestMsg.error("没有访问权限!")));
 */
                if (isAjaxRequest(httpServletRequest)) {
                    httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
                } else {
                    httpServletResponse.sendRedirect("");
                }
            }
        };
        return entryPoint;
    }


}
