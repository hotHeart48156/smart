package org.order.domain.vaueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class CouponId extends AbstractId {
    @Column(name = "coupon_id")
    private String id;
    private final int hashCode;

    public CouponId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }


}
