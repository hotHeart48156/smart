package org.order.domain.customer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.id.OrderReturnReasonId;
import org.order.domain.customer.vaueobject.status.ReturnReasonStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.ReturnReasonType;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderReturnReason implements org.order.domain.customer.entity.Entity {
    @Embedded
private  OrderId orderId;
    @Embedded
private  OrderReturnReasonId id;
    @Embedded
private  ReturnReasonStatus returnReasonStatus;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  ReturnReasonType returnReasonType;



}
