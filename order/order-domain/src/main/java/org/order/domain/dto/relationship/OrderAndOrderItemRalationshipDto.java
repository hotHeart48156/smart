package org.order.domain.dto.relationship;

import org.order.domain.entity.relationship.OrderAndOrderItemRelationship;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.id.Id;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderItemId;

/**
 * @author yangbiao
 */

public class OrderAndOrderItemRalationshipDto {
    private String orderId;
    private String orderItemId;

    public void accept(OrderAndOrderItemRelationship relationship) {
        relationship.setId(ValueObjectFactory.newInstance(Id.class));
        relationship.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        relationship.setOrderItemId(ValueObjectFactory.newInstance(OrderItemId.class, orderItemId));
    }
}
