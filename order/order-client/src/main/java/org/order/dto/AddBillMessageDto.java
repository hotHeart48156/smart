package org.order.dto;

import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.BillContent;
import org.order.domain.vaueobject.BillHead;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.type.BillType;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */

public class AddBillMessageDto {
    @NotNull
    private String billType;

    @NotNull
    private String billContent;

    @NotNull
    private String billHead;

    public void accept(Order order) {
        order.setBillContent(ValueObjectFactory.getInstance(BillContent.class, billContent));
        order.setBillHead(ValueObjectFactory.getInstance(BillHead.class, billHead.getClass()));
        order.setBillType(ValueObjectFactory.getInstance(BillType.class, billType.getClass()));
    }

}
