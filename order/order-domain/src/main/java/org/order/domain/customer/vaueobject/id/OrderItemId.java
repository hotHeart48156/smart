package org.order.domain.customer.vaueobject.id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Embeddable
@Value
@Data

public class OrderItemId extends AbstractId {
    @Column(name = "order_item_id")
    private Long orderItemId;
}
