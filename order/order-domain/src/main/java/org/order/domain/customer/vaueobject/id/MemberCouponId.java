package org.order.domain.customer.vaueobject.id;

import org.axonframework.common.IdentifierFactory;

/**
 * @author "yangbiao"
 */
public class MemberCouponId extends AbstractId {
    private String id;
    private final int hashCode;

    public MemberCouponId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

}
