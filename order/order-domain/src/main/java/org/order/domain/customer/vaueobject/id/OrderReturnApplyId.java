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
@Value
@Embeddable
public class OrderReturnApplyId extends AbstractId {
    @Column(name = "order_return_apply_id")
    private Long orderReturnApplyId;

}
