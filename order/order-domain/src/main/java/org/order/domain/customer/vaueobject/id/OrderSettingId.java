package org.order.domain.customer.vaueobject.id;

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
public class OrderSettingId extends AbstractId {
    @Column(name = "order_setting_id")
    private String orderSettingId;
}
