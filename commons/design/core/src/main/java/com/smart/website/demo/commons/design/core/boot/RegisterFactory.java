package com.smart.website.demo.commons.design.core.boot;


import com.smart.website.account.command.Command;
import com.smart.website.account.command.PostInterceptor;
import com.smart.website.account.command.PreInterceptor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * RegisterFactory
 *
 * @author fulan.zjf 2017-11-04
 */
@Component
public class RegisterFactory {

    @Autowired
    private PreInterceptorRegister preInterceptorRegister;
    @Autowired
    private PostInterceptorRegister postInterceptorRegister;
    @Autowired
    private CommandRegister commandRegister;
    @Autowired
    private ExtensionRegister extensionRegister;
    @Autowired
    private EventRegister eventRegister;


    public RegisterI getRegister(Class<?> targetClz) {
        PreInterceptor preInterceptorAnn = targetClz.getDeclaredAnnotation(PreInterceptor.class);
        if (preInterceptorAnn != null) {
            return preInterceptorRegister;
        }
        PostInterceptor postInterceptorAnn = targetClz.getDeclaredAnnotation(PostInterceptor.class);
        if (postInterceptorAnn != null) {
            return postInterceptorRegister;
        }
        Command commandAnn = targetClz.getDeclaredAnnotation(Command.class);
        if (commandAnn != null) {
            return commandRegister;
        }
        Extension extensionAnn = targetClz.getDeclaredAnnotation(Extension.class);
        if (extensionAnn != null) {
            return extensionRegister;
        }
        EventHandler eventHandlerAnn = targetClz.getDeclaredAnnotation(EventHandler.class);
        if (eventHandlerAnn != null) {
            return eventRegister;
        }
        return null;
    }
}
