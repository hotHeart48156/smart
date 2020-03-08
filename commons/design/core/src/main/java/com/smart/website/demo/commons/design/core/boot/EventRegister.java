package com.smart.website.demo.commons.design.core.boot;

import com.smart.website.account.common.ApplicationContextHelper;
import com.smart.website.account.common.ColaConstant;
import com.smart.website.account.event.EventHandlerI;
import com.smart.website.account.event.EventHub;
import com.smart.website.account.exception.framework.ColaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * EventRegister
 *
 * @author shawnzhan.zxy
 * @date 2017/11/20
 */
@Component
public class EventRegister implements RegisterI {

    @Autowired
    private EventHub eventHub;

    @Override
    public void doRegistration(Class<?> targetClz) {
        Class<? extends EventI> eventClz = getEventFromExecutor(targetClz);
        EventHandlerI executor = (EventHandlerI) ApplicationContextHelper.getBean(targetClz);
        eventHub.register(eventClz, executor);
    }

    private Class<? extends EventI> getEventFromExecutor(Class<?> eventExecutorClz) {
        Method[] methods = eventExecutorClz.getDeclaredMethods();
        for (Method method : methods) {
            if (isExecuteMethod(method)) {
                return checkAndGetEventParamType(method);
            }
        }
        throw new ColaException("Event param in " + eventExecutorClz + " " + ColaConstant.EXE_METHOD
                + "() is not detected");
    }

    private boolean isExecuteMethod(Method method) {
        return ColaConstant.EXE_METHOD.equals(method.getName()) && !method.isBridge();
    }

    private Class checkAndGetEventParamType(Method method) {
        Class<?>[] exeParams = method.getParameterTypes();
        if (exeParams.length == 0) {
            throw new ColaException("Execute method in " + method.getDeclaringClass() + " should at least have one parameter");
        }
        if (!EventI.class.isAssignableFrom(exeParams[0])) {
            throw new ColaException("Execute method in " + method.getDeclaringClass() + " should be the subClass of Event");
        }
        return exeParams[0];
    }
}
