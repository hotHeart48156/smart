package com.smart.website.demo.commons.design.core.domain;


import com.smart.website.accout.commons.event.DomainEventI;

public interface DomainEventServiceI {
    /**
     * 发布领域事件
     * <p>
     * 具体的事件处理机制，由应用自己实现，在sofa-extension中，我们提供了MetaQ的实现
     *
     * @param domainEvent
     */
    void publish(DomainEventI domainEvent);
}
