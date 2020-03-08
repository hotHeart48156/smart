package com.smart.website.demo.commons.design.core.command;

import com.google.common.collect.FluentIterable;
import com.smart.website.account.logger.Logger;
import com.smart.website.account.logger.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.List;


@Component

@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CommandInvocation {

    private static Logger logger = LoggerFactory.getLogger(CommandInvocation.class);


    private CommandExecutorI commandExecutor;

    private Iterable<CommandInterceptorI> preInterceptors;

    private Iterable<CommandInterceptorI> postInterceptors;

    @Autowired
    private CommandHub commandHub;


    public CommandInvocation() {

    }

    public CommandInvocation(CommandExecutorI commandExecutor, List<CommandInterceptorI> preInterceptors,
                             List<CommandInterceptorI> postInterceptors) {
        this.commandExecutor = commandExecutor;
        this.preInterceptors = preInterceptors;
        this.postInterceptors = postInterceptors;
    }

    public Response invoke(Command command) {
        Response response = null;
        try {
            preIntercept(command);
            response = commandExecutor.execute(command);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //make sure post interceptors performs even though exception happens
            postIntercept(command, response);
        }
        return response;
    }

    private void postIntercept(Command command, Response response) {
        try {
            for (CommandInterceptorI postInterceptor : FluentIterable.from(postInterceptors).toSet()) {
                postInterceptor.postIntercept(command, response);
            }
        } catch (Exception e) {
            logger.error("postInterceptor error:" + e.getMessage(), e);
        }
    }

    private void preIntercept(Command command) {
        for (CommandInterceptorI preInterceptor : FluentIterable.from(preInterceptors).toSet()) {
            preInterceptor.preIntercept(command);
        }
    }

    private com.smart.website.accout.commons.dto.Response getResponseInstance(Command cmd) {
        Class responseClz = commandHub.getResponseRepository().get(cmd.getClass());
        try {
            return (com.smart.website.accout.commons.dto.Response) responseClz.getConstructor().newInstance();
        } catch (Exception e) {
            return new com.smart.website.accout.commons.dto.Response();
        }
    }
}
