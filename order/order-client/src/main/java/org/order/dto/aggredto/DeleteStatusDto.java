package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.status.DeleteStatus;
import org.order.dto.AbstractDto;

@Data
public class DeleteStatusDto   extends AbstractDto {
    private String OrderId;
    private String deleteStatus;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setDeleteStatus(ValueObjectFactory.newInstance(DeleteStatus.class, this.deleteStatus));
    }
}
