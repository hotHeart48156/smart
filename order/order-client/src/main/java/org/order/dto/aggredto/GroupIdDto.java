package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.id.GroupId;
import org.order.dto.AbstractDto;

@Data
public class GroupIdDto   extends AbstractDto {
    private String OrderId;
    private String groupId;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setGroupId(ValueObjectFactory.newInstance(GroupId.class, this.groupId));
    }
}
