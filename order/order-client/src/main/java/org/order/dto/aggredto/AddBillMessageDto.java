package org.order.dto.aggredto;

import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.BillContent;
import org.order.domain.vaueobject.BillHead;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.type.BillType;
import org.order.dto.AbstractDto;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */

public class AddBillMessageDto extends AbstractDto {
    @NotNull
    private String billType;

    @NotNull
    private String billContent;

    @NotNull
    private String billHead;

    public void accept(Order order) {
        order.setBillContent(ValueObjectFactory.newInstance(BillContent.class, billContent));
        order.setBillHead(ValueObjectFactory.newInstance(BillHead.class, billHead));
        order.setBillType(ValueObjectFactory.newInstance(BillType.class, billType));
    }

}
