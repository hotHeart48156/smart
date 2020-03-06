package org.order.domain.customer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.Note;
import org.order.domain.customer.vaueobject.OperateMan;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.id.OrderOperateHistoryId;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Date;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderOperateHistory implements org.order.domain.customer.entity.Entity {
    @EmbeddedId
private  OrderOperateHistoryId orderOperateHistoryId;
    @Embedded
private  OrderId orderId;
    @Embedded
private  OperateMan operateMan;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  OrderStatus orderStatus;
    @Embedded
private  Note note;



}
