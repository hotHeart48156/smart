package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.OrderSetting;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.id.OrderSettingId;
import org.order.domain.vaueobject.time.*;

@Data
public class OrderSettingDto   extends AbstractEntityDto{
    private String orderSettingId;
    private String flashOrderOverTime;
    private String normalOrderOverTime;
    private String confirmOverTime;
    private String finishOverTime;
    private String commentOverTime;

    public void accept(OrderSetting ordersetting) {
        ordersetting.setOrderSettingId(ValueObjectFactory.newInstance(OrderSettingId.class));
        ordersetting.setFlashOrderOverTime(ValueObjectFactory.newInstance(FlashOrderOverTime.class, flashOrderOverTime));
        ordersetting.setNormalOrderOverTime(ValueObjectFactory.newInstance(NormalOrderOverTime.class, normalOrderOverTime));
        ordersetting.setConfirmOverTime(ValueObjectFactory.newInstance(ConfirmOverTime.class, confirmOverTime));
        ordersetting.setFinishOverTime(ValueObjectFactory.newInstance(FinishOverTime.class, finishOverTime));
        ordersetting.setCommentOverTime(ValueObjectFactory.newInstance(CommentOverTime.class, commentOverTime));
        ordersetting.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class));
    }
}
