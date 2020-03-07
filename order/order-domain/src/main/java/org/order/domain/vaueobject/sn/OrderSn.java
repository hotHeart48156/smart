package org.order.domain.vaueobject.sn;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class OrderSn extends AbstractSn {
    @Column(name = "order_sn")
    private String orderSn;

}
