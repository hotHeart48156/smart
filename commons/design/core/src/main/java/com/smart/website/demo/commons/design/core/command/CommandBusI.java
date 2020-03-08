package com.smart.website.demo.commons.design.core.command;


import javax.ws.rs.core.Response;

/**
 * @author fulan.zjf 2017年10月21日 下午11:00:58
 */
public interface CommandBusI {

    /**
     * Send command to CommandBus, then the command will be executed by CommandExecutor
     *
     * @param Command or Query
     * @return Response
     */
    Response send(Command cmd);
}
