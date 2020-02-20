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
public class OrderOperateHistoryId extends AbstractId {
    @Column(name = "order_operate_history_id")
    private Long orderOperateHistoryId;

}
