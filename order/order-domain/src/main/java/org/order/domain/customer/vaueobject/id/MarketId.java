package org.order.domain.customer.vaueobject.id;

import org.axonframework.common.IdentifierFactory;
import org.order.domain.customer.vaueobject.MarketScope;

/**
 * @author "yangbiao"
 */
public class MarketId extends AbstractId {
    private String id;
    private final int hashCode;

    public MarketId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

}
