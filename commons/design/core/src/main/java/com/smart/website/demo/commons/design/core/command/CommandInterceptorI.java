package com.smart.website.demo.commons.design.core.command;


import javax.ws.rs.core.Response;

/**
 * Interceptor will do AOP processing before or after Command Execution
 *
 * @author fulan.zjf 2017年10月25日 下午4:04:43
 */
public interface CommandInterceptorI {

    /**
     * Pre-processing before command execution
     *
     * @param command
     */
    default void preIntercept(Command command) {
    }

    /**
     * Post-processing after command execution
     *
     * @param command
     * @param response, Note that response could be null, check it before use
     */
    default void postIntercept(Command command, Response response) {
    }

}
