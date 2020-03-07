package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderReturnReasonId;
import org.order.domain.vaueobject.status.ReturnReasonStatus;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.type.ReturnReasonType;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderReturnReason implements org.order.domain.entity.Entity {
    @Embedded
private OrderId orderId;
    @Embedded
private OrderReturnReasonId id;
    @Embedded
private ReturnReasonStatus returnReasonStatus;
    @Embedded
private CreateTime createTime;
    @Embedded
private ReturnReasonType returnReasonType;



}
