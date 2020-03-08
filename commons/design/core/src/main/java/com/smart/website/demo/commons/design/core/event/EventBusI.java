package com.smart.website.demo.commons.design.core.event;


import com.smart.website.accout.commons.event.EventI;

import javax.ws.rs.core.Response;

/**
 * EventBus interface
 *
 * @author shawnzhan.zxy
 * @date 2017/11/20
 */
public interface EventBusI {

    /**
     * Send event to EventBus
     *
     * @param event
     * @return Response
     */
    Response fire(EventI event);

    /**
     * fire ${parentArtifactId} handlers which registed the event
     *
     * @param event
     * @return Response
     */
    void fireAll(EventI event);

    /**
     * Async fire ${parentArtifactId} handlers
     *
     * @param event
     */
    void asyncFire(EventI event);
}
