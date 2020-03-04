package org.order.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.order.domain.customer.aggregation.Order;
import org.order.domain.customer.vaueobject.BillContent;
import org.order.domain.customer.vaueobject.BillHead;
import org.order.domain.customer.vaueobject.ValueObjectFactory;
import org.order.domain.customer.vaueobject.type.BillType;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class AddBillMessageEvent {
    @NotNull
    private String billType;

    @NotNull
    private String billContent;

    @NotNull
    private String billHead;


}
