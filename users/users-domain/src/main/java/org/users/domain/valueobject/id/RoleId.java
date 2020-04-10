package org.users.domain.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = false)
@Value
@Embeddable

public class RoleId extends AbstractId{
    @Column(name ="   roleId")
private String id;

    public RoleId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }


}
