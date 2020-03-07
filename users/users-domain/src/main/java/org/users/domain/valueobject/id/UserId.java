package org.users.domain.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable

public class UserId extends AbstractId {
    @Column(name ="   userId")
private String id;

    public UserId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }



}
