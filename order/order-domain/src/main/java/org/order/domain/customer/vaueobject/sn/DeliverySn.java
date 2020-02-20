package org.order.domain.customer.vaueobject.sn;

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
public class DeliverySn extends AbstractSn {
    @Column(name = "delivery_sn")
    private String deliverySn;

}
