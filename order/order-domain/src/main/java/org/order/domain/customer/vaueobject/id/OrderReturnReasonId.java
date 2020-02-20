package org.order.domain.customer.vaueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class OrderReturnReasonId extends AbstractId {
    @Column(name = "order_return_reason_id")
    private Long orderReturnReasonId;
}
