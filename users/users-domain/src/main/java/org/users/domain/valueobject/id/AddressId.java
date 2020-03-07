package org.users.domain.valueobject.id;

import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class AddressId extends AbstractId {
    @Column(name ="   addressId")
private String id;

    public AddressId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }


}
