package org.users.domain.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Embeddable
@Value
public class UserCollectId extends AbstractId {
    @Column(name ="   tagId")
    private String id;

    public UserCollectId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }
}
