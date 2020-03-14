package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.OrderReturnReason;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderReturnReasonId;
import org.order.domain.vaueobject.status.ReturnReasonStatus;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.type.ReturnReasonType;

@Data
public class OrderReturnReasonDto {
    private String orderId;
    private String id;
    private String returnReasonStatus;
    private String createTime;
    private String returnReasonType;

    public void accept(OrderReturnReason orderreturnreason) {
        orderreturnreason.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        orderreturnreason.setId(ValueObjectFactory.newInstance(OrderReturnReasonId.class, id));
        orderreturnreason.setReturnReasonStatus(ValueObjectFactory.newInstance(ReturnReasonStatus.class, returnReasonStatus));
        orderreturnreason.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        orderreturnreason.setReturnReasonType(ValueObjectFactory.newInstance(ReturnReasonType.class, returnReasonType));
    }
}
