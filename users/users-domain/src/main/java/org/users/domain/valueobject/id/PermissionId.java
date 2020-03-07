package org.users.domain.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode()
@Value
@Embeddable

public class PermissionId {
    @Column(name ="   permissionId")
private String id;

    public PermissionId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }


}
