package org.order.domain.customer.vaueobject.id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;
import org.order.domain.customer.entity.OrderReturnApply;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class OrderReturnApplyId extends AbstractId {
    @Column(name = "order_return_apply_id")
    private String id;
    private final int hashCode;

    public OrderReturnApplyId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }


}
