package org.users.security.configuration.oauth.authorizationserver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.users.security.encode.Encode;
import org.users.security.entrypoint.EntryPoint;
import org.users.security.exception.WebResponseExceptionTranslator;
import org.users.security.handle.error.AccessDenied;
import org.users.security.user.DetailService;

/**
 * @author "yangbiao"
 * @date 2019122312:59
 */
@Configuration
//可以用 @EnableAuthorizationServer 注解来配置OAuth2.0 授权服务机制，通过使用@Bean注解的几个方法一起来配置这个授权服务。
@EnableAuthorizationServer
@EnableOAuth2Sso
/**
 * ClientDetailsServiceConfigurer：用来配置客户端详情服务（ClientDetailsService），客户端详情信息在这里进行初始化，你能够把客户端详情信息写死在这里或者是通过数据库来存储调取详情信息。
 * AuthorizationServerSecurityConfigurer：用来配置令牌端点(Token Endpoint)的安全约束.
 * AuthorizationServerEndpointsConfigurer：用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)。
 */
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    private static final String DEMO_RESOURCE_ID = "api";
    @Autowired
    AccessDenied accessDenied;
    @Autowired
    EntryPoint entryPoint;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    @Qualifier("UserDetailService")
    private DetailService detailService;
    @Autowired
    private WebResponseExceptionTranslator responseExceptionTranslator;
    @Autowired
    private Encode encode;

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                .allowFormAuthenticationForClients()
                .checkTokenAccess("user")
                .accessDeniedHandler(accessDenied.deniedHandler())
                .allowFormAuthenticationForClients()
                .authenticationEntryPoint(entryPoint.commence())
                .passwordEncoder(encode.encoder())
                .allowFormAuthenticationForClients()
                .sslOnly()
                .tokenKeyAccess("fdsc");


    }

    /**
     * 不同的授权类型为客户端（Client）提供了不同的获取令牌（Token）方式，
     * 为了实现并确定这几种授权，需要配置使用 ClientDetailsService 和 TokenService 来开启或者禁用这几种授权机制。
     * 不管使用什么样的授权类型（Grant Type），每一个客户端（Client）都能够通过明确的配置以及权限来实现不同的授权访问机制。
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients
                .inMemory()
                //指定客户端
                .withClient("client_1")
                .resourceIds(DEMO_RESOURCE_ID)
                /**
                 * authorization_code,授权码，适用于所有有Server端的应用，如Web站点、有Server端的手机客户端。
                 *implicit 无Server端配合的应用，手机/桌面客户端程序、浏览器插件。JavaScript等脚本客户端脚本语言实现的应用。
                 * password 密码模式，通过username和password获取token，适用于用户对应用程序高度信任的情况。比如是用户操作系统的一部分。
                 * 认证服务器只有在其他授权模式无法执行的情况下，才能考虑使用这种模式。
                 * client_credentials 客户端凭证，客户端模式应用于应用程序想要以自己的名义与授权服务器以及资源服务器进行互动，使用了第三方的静态文件服务
                 * 刷新token
                 * 访问令牌也有多种类型，若为bearer类型，那么谁持有访问令牌，谁就能访问资源。
                 * 在令牌的有效期内，Client可以多次携带令牌去访问资源。
                 * RS验证令牌的有效性，比如是否伪造、是否越权、是否过期，验证通过后，才能提供服务。
                 *

                 /*
                 .authorizedGrantTypes("client_credentials", "refresh_token","authorization_code", "password")
                 /**回调地址，客户端应用在此回调获取授权码，然后使用授权码获取token
                 *在redirect_uri中应包含如下参数：client_id, scope (描述被访问的资源), redirect_uri (即Client的URI), state (用于抵制CSRF攻击)
                 *此外，请求中还可以包含access_type和approval_prompt参数。当approval_prompt=force时，AS将提供交互页面，要求RO必须显式地批准（或拒绝）Client的此次请求。如果没有approval_prompt参数，则默认为RO批准此次请求。
                 *当access_type=offline时，AS将在颁发access_token时，同时还会颁发一个refresh_token。因为access_token的有效期较短（如3600秒）
                 *，为了优化协议执行流程，offline方式将允许Client直接持refresh_token来换取一个新的access_token。
                 * 若请求被批准，AS使用步骤(1)中Client提供的redirect_uri重定向RO用户代理到Client。redirect_uri须包含authorization_code，以及步骤1中Client提供的state。
                 * 若请求被拒绝，AS将通过redirect_uri返回相应的错误信息。
                 * Client拿authorization_code去访问AS以交换所需的access_token。Client请求信息中应包含用于认证Client身份所需的认证数据，
                 * 以及上一步请求authorization_code时所用的redirect_uri。
                 *  AS在收到authorization_code时需要验证Client的身份，并验证收到的redirect_uri与第3步请求authorization_code时所使用的redirect_uri相匹配。
                 *  如果验证通过，AS将返回access_token，以及refresh_toke
                 */
                .redirectUris("")
                .scopes("all")
                .authorities("client")
                .secret(encode.encoder().encode("256"))
                .and()
                .withClient("client_2")
                .resourceIds(DEMO_RESOURCE_ID)
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("select")
                .authorities("client")
                .secret("123456")
        ;

    }

    /**
     * @param endpoints
     * @throws Exception 授权是使用 AuthorizationEndpoint 这个端点来进行控制的，
     *                   你能够使用 AuthorizationServerEndpointsConfigurer 这个对象的实例来进行配置(AuthorizationServerConfigurer 的一个回调配置项，见上的概述) ，
     *                   如果你不进行设置的话，默认是除了资源所有者密码（password）授权类型以外，支持其余所有标准授权类型的（RFC6749）。
     *                   authenticationManager：认证管理器，当你选择了资源所有者密码（password）授权类型的时候，请设置这个属性注入一个 AuthenticationManager 对象。
     *                   userDetailsService：如果啊，你设置了这个属性的话，那说明你有一个自己的 UserDetailsService 接口的实现，或者你可以把这个东西设置到全局域上面去（例如 GlobalAuthenticationManagerConfigurer 这个配置对象），当你设置了这个之后，那么 "refresh_token" 即刷新令牌授权类型模式的流程中就会包含一个检查，用来确保这个账号是否仍然有效，假如说你禁用了这个账户的话。
     *                   authorizationCodeServices：这个属性是用来设置授权码服务的（即 AuthorizationCodeServices 的实例对象），主要用于 "authorization_code" 授权码类型模式。
     *                   implicitGrantService：这个属性用于设置隐式授权模式，用来管理隐式授权模式的状态。
     *                   tokenGranter：这个属性就很牛B了，当你设置了这个东西（即 TokenGranter 接口实现），
     *                   那么授权将会交由你来完全掌控，并且会忽略掉上面的这几个属性，这个属性一般是用作拓展用途的，即标准的四种授权模式已经满足不了你的需求的时候，才会考虑使用这个。
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .tokenStore(jwtTokenStore())
                .authenticationManager(authenticationManager)
                .userDetailsService(detailService.detailsService())//密码模式需要在数据库中进行认证
                .exceptionTranslator(responseExceptionTranslator)
                .accessTokenConverter(accessTokenConverter())

        ;


    }

    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey("testKey");
        return jwtAccessTokenConverter;
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("test-secret");
        return converter;
    }

}