package org.order.domain.vaueobject.id;

import org.axonframework.common.IdentifierFactory;

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
