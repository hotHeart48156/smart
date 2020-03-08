package com.smart.website.demo.commons.design.core.boot;

import com.smart.website.account.command.Command;
import com.smart.website.account.command.CommandHub;
import com.smart.website.account.command.CommandInterceptorI;
import com.smart.website.account.command.PostInterceptor;
import com.smart.website.account.common.ApplicationContextHelper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * PostInterceptorRegister
 *
 * @author fulan.zjf 2017-11-04
 */
@Component
public class PostInterceptorRegister extends AbstractRegister {

    @Autowired
    private CommandHub commandHub;

    @Override
    public void doRegistration(Class<?> targetClz) {
        CommandInterceptorI commandInterceptor = (CommandInterceptorI) ApplicationContextHelper.getBean(targetClz);
        PostInterceptor postInterceptorAnn = targetClz.getDeclaredAnnotation(PostInterceptor.class);
        Class<? extends Command>[] supportClasses = postInterceptorAnn.commands();
        registerInterceptor(supportClasses, commandInterceptor);
    }

    private void registerInterceptor(Class<? extends Command>[] supportClasses, CommandInterceptorI commandInterceptor) {
        if (null == supportClasses || supportClasses.length == 0) {
            commandHub.getGlobalPostInterceptors().add(commandInterceptor);
            order(commandHub.getGlobalPostInterceptors());
            return;
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
