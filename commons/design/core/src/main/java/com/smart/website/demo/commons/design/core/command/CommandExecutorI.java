package com.smart.website.demo.commons.design.core.command;


import javax.ws.rs.core.Response;

/**
 * CommandExecutorI
 *
 * @author fulan.zjf 2017年10月21日 下午11:01:05
 */
public interface CommandExecutorI<R extends Response, C extends Command> {

    R execute(C cmd);
}
