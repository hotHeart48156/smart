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

public class PermissionCategoryId {
    @Column(name ="   permissionCategoryId")
private String id;

    public PermissionCategoryId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }


}
