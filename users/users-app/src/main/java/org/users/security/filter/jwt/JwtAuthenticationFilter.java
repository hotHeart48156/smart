package org.users.security.filter.jwt;

import com.smart.website.security.spring.constant.ConstantKey;
import com.smart.website.security.spring.filter.Filter;
import io.jsonwebtoken.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.users.security.constant.ConstantKey;
import org.users.security.filter.Filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import
/**
 * @author "yangbiao"
 * @date 2019122312:33
 */

/**
 * basicauthenticationfilter负责处理HTTP头中显示的基本身份验证凭据。
 * 这可以用于验证由Spring远程处理协议（如Hessian和Burlap）以及普通浏览器用户代理（如Firefox和Internet Explorer）发出的调用。
 * HTTP基本身份验证的标准由RFC1945第11节定义，basicauthenticationfilter符合此RFC。
 * 基本身份验证是一种很有吸引力的身份验证方法，因为它在用户代理中被广泛部署，而且实现非常简单（它只是用户名：password的base64编码，在HTTP头中指定）。
 * <p>
 * <p>
 * <p>
 * DigestAuthenticationFilter能够处理HTTP头中显示的摘要式身份验证凭据。
 * 摘要式身份验证试图解决基本身份验证的许多弱点，特别是通过确保凭证从未以明文形式跨线发送来解决。
 * 许多用户代理支持摘要式身份验证，包括Mozilla Firefox和Internet Explorer。
 * 管理HTTP摘要式身份验证的标准由RFC2617定义，它更新了RFC2069规定的摘要式身份验证标准的早期版本。
 * 大多数用户代理实现RFC2617。
 * Spring Security的DigestAuthenticationFilter与RFC2617规定的“认证”保护质量（QOP）兼容，后者还提供了与RFC2069的向后兼容性。
 * 如果您需要使用未加密的HTTP（即没有TLS/HTTPS），并且希望最大限度地提高身份验证过程的安全性，那么摘要式身份验证是一个更具吸引力的选项。
 * 事实上，摘要式身份验证是WebDAV协议的强制性要求，如RFC2518第17.1节所述。
 */
public class JwtAuthenticationFilter extends BasicAuthenticationFilter implements Filter {
    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }


    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        String header = req.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            chain.doFilter(res, req);
            return;
        }

        UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
    }

}

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        long start = System.currentTimeMillis();
        String token = request.getHeader("Authorization");
        if (token == null || token.isEmpty()) {
            throw new TokenException("Token为空");
        }
        // parse the token.
        String user = null;
        try {
            user = Jwts.parser()
                    .setSigningKey(ConstantKey.SIGNING_KEY)
                    .parseClaimsJws(token.replace("Bearer ", ""))
                    .getBody()
                    .getSubject();
            long end = System.currentTimeMillis();
            logger.info("执行时间: {}", (end - start) + " 毫秒");
            if (user != null) {
                String[] split = user.split("-")[1].split(",");
                List<GrantedAuthority> authorities = new ArrayList<>();
                for (int i = 0; i < split.length; i++) {
                    authorities.add(new SimpleGrantedAuthority(split[i]));
                }
                return new UsernamePasswordAuthenticationToken(user, null, authorities);
            }

        } catch (ExpiredJwtException e) {
            logger.error("Token已过期: {} " + e);
            throw new TokenException("Token已过期");
        } catch (UnsupportedJwtException e) {
            logger.error("Token格式错误: {} " + e);
            throw new TokenException("Token格式错误");
        } catch (MalformedJwtException e) {
            logger.error("Token没有被正确构造: {} " + e);
            throw new TokenException("Token没有被正确构造");
        } catch (SignatureException e) {
            logger.error("签名失败: {} " + e);
            throw new TokenException("签名失败");
        } catch (IllegalArgumentException e) {
            logger.error("非法参数异常: {} " + e);
            throw new TokenException("非法参数异常");
        }

        return null;
    }
}
