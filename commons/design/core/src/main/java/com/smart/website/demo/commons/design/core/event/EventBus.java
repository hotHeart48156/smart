package com.smart.website.demo.commons.design.core.event;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.smart.website.account.logger.Logger;
import com.smart.website.account.logger.LoggerFactory;
import com.smart.website.accout.commons.event.EventI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Event Bus
 *
 * @author shawnzhan.zxy
 * @date 2017/11/20
 */
@Component
public class EventBus implements EventBusI {
    Logger logger = LoggerFactory.getLogger(EventBus.class);

    /**
     * 默认线程池
     * 如果处理器无定制线程池，则使用此默认
     */
    ExecutorService defaultExecutor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1,
            Runtime.getRuntime().availableProcessors() + 1,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1000), new ThreadFactoryBuilder().setNameFormat("event-bus-pool-%d").build());

    @Autowired
    private EventHub eventHub;

    @SuppressWarnings("unchecked")
    public Response fire(EventI event) {
        Response response = null;
        EventHandlerI eventHandlerI = null;
        try {
            eventHandlerI = eventHub.getEventHandler(event.getClass()).get(0);
            response = eventHandlerI.execute(event);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return response;
    }


    public void fireAll(EventI event) {
        eventHub.getEventHandler(event.getClass()).stream().map(p -> {
            Response response = null;
            try {
                response = p.execute(event);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            return response;
        }).collect(Collectors.toList());
    }


    public void asyncFire(EventI event) {
        eventHub.getEventHandler(event.getClass()).parallelStream().map(p -> {
            Response response = null;
            try {
                if (null != p.getExecutor()) {
                    p.getExecutor().submit(() -> p.execute(event));
                } else {
                    defaultExecutor.submit(() -> p.execute(event));
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            return response;
        }).collect(Collectors.toList());
    }


}
