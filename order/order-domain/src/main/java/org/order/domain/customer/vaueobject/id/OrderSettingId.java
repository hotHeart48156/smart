package org.order.domain.customer.vaueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;
import org.order.domain.customer.entity.OrderSetting;

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
    private String id;
    private final int hashCode;

    public OrderSettingId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

}
