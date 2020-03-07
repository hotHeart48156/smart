package org.order.domain.vaueobject.id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Embeddable
@Value
@Data

public class OrderItemId extends AbstractId {
    @Column(name = "order_item_id")
    private String id;
    private final int hashCode;

    public OrderItemId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

}
