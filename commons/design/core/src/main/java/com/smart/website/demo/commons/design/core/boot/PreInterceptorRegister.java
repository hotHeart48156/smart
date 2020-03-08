package com.smart.website.demo.commons.design.core.boot;


import com.smart.website.account.command.Command;
import com.smart.website.account.command.CommandHub;
import com.smart.website.account.command.CommandInterceptorI;
import com.smart.website.account.command.PreInterceptor;
import com.smart.website.account.common.ApplicationContextHelper;


/**
 * PreInterceptorRegister
 *
 * @author fulan.zjf 2017-11-04
 */
@Component
public class PreInterceptorRegister extends AbstractRegister {

    @Autowired
    private CommandHub commandHub;

    @Override
    public void doRegistration(Class<?> targetClz) {
        CommandInterceptorI commandInterceptor = (CommandInterceptorI) ApplicationContextHelper.getBean(targetClz);
        PreInterceptor preInterceptorAnn = targetClz.getDeclaredAnnotation(PreInterceptor.class);
        Class<? extends Command>[] supportClasses = preInterceptorAnn.commands();
        registerInterceptor(supportClasses, commandInterceptor);
    }

    private void registerInterceptor(Class<? extends Command>[] supportClasses, CommandInterceptorI commandInterceptor) {
        if (null == supportClasses || supportClasses.length == 0) {
            commandHub.getGlobalPreInterceptors().add(commandInterceptor);
            order(commandHub.getGlobalPreInterceptors());
            return;
        }
    }
}
