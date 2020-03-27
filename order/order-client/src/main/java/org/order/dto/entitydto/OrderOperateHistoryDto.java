package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.OrderOperateHistory;
import org.order.domain.vaueobject.Note;
import org.order.domain.vaueobject.OperateMan;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderOperateHistoryId;
import org.order.domain.vaueobject.status.OrderStatus;
import org.order.domain.vaueobject.time.CreateTime;

@Data
public class OrderOperateHistoryDto   extends AbstractEntityDto{
    private String orderOperateHistoryId;
    private String orderId;
    private String operateMan;
    private String createTime;
    private String orderStatus;
    private String note;

    public void accept(OrderOperateHistory orderoperatehistory) {
        orderoperatehistory.setOrderOperateHistoryId(ValueObjectFactory.newInstance(OrderOperateHistoryId.class, orderOperateHistoryId));
        orderoperatehistory.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        orderoperatehistory.setOperateMan(ValueObjectFactory.newInstance(OperateMan.class, operateMan));
        orderoperatehistory.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        orderoperatehistory.setOrderStatus(ValueObjectFactory.newInstance(OrderStatus.class, orderStatus));
        orderoperatehistory.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
