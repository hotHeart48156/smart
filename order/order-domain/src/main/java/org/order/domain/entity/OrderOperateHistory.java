package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.Note;
import org.order.domain.vaueobject.OperateMan;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderOperateHistoryId;
import org.order.domain.vaueobject.status.OrderStatus;
import org.order.domain.vaueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderOperateHistory implements org.order.domain.entity.Entity {
    @EmbeddedId
private OrderOperateHistoryId orderOperateHistoryId;
    @Embedded
private OrderId orderId;
    @Embedded
private OperateMan operateMan;
    @Embedded
private CreateTime createTime;
    @Embedded
private OrderStatus orderStatus;
    @Embedded
private Note note;



}
