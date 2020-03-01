package org.users.security.configuration.oauth.resourceserver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.users.security.entrypoint.EntryPoint;
import org.users.security.handle.error.AccessDenied;

/**
 * @author "yangbiao"
 * @date 2019122322:46
 */

/**
 * 一个资源服务（可以和授权服务在同一个应用中，当然也可以分离开成为两个不同的应用程序）提供一些受token令牌保护的资源，
 * Spring OAuth提供者是通过Spring Security authentication filter 即验证过滤器来实现的保护，
 * 你可以通过 @EnableResourceServer 注解到一个 @Configuration 配置类上，
 * 并且必须使用 ResourceServerConfigurer 这个配置对象来进行配置（可以选择继承自 ResourceServerConfigurerAdapter 然后覆写其中的方法，参数就是这个对象的实例），
 * tokenServices：ResourceServerTokenServices 类的实例，用来实现令牌服务。
 * resourceId：这个资源服务的ID，这个属性是可选的，但是推荐设置并在授权服务中进行验证。
 * 其他的拓展属性例如 tokenExtractor 令牌提取器用来提取请求中的令牌。
 * 请求匹配器，用来设置需要进行保护的资源路径，默认的情况下是受保护资源服务的全部路径。
 * 受保护资源的访问规则，默认的规则是简单的身份验证（plain authenticated）。
 * 其他的自定义权限保护规则通过 HttpSecurity 来进行配置。
 */
//@EnableResourceServer 注解自动增加了一个类型为 OAuth2AuthenticationProcessingFilter 的过滤器链，
@EnableResourceServer
public class ResourceServerconfiguration extends ResourceServerConfigurerAdapter {
    private static final String DEMO_RESOURCE_ID = "api";
    @Autowired
    @Qualifier("AccessDeniedHandle")
    AccessDenied accessDenied;
    @Autowired
    EntryPoint entryPoint;

    @Override
    @Bean
    public void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .authorizeRequests()
                .antMatchers("/api/**")
                .authenticated();

    }

    @Override
    @Bean
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources
                .authenticationEntryPoint(entryPoint.commence())
                .accessDeniedHandler(accessDenied.deniedHandler())
                .resourceId("cds");

    }

    @Bean
    public RemoteTokenServices tokenServices() {
        final RemoteTokenServices tokenServices = new RemoteTokenServices();
        tokenServices.setCheckTokenEndpointUrl("");
        return tokenServices;
    }
}
