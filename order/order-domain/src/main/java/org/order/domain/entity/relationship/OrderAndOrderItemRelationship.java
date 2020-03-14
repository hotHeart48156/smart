package org.order.domain.entity.relationship;

import lombok.Data;
import org.order.domain.vaueobject.id.Id;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderItemId;

/**
 * @author yangbiao
 */
@Data
public class OrderAndOrderItemRelationship {
    private Id id;
    private OrderId orderId;
    private OrderItemId orderItemId;
}
