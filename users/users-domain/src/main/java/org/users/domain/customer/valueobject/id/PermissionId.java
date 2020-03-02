package org.users.domain.customer.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode()
@Value
@Embeddable

public class PermissionId {
    private String id;
    private final int hashCode;

    public PermissionId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hashCode;
    }
}
