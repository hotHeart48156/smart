package org.order.api.application;

import org.order.domain.customer.vo.OrderParam;

/**
 * @author "yangbiao"
 */
public interface OrderCreateApplication {
    void createOrder(OrderParam orderParam);
}
