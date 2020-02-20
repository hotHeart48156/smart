package org.account.security.configuration;

import org.account.security.user.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


/**
 * @author "yangbiao"
 * @date 2019122316:56
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    @Qualifier("UserDetailService")
    DetailService detailService;

    @Override
    @Bean
    //Web层面的配置，一般用来配置无需安全检查的路径
    public void configure(WebSecurity webSecurity) throws Exception {


    }

    //Request层面的配置，对应XML Configuration中的<http>元素
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        ;
    }

    //身份验证配置，用于注入自定义身份验证Bean和密码校验规则
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(detailService.detailsService());
    }

    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

}
