package org.users.domain.valueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Embeddable
@Value
public class UserCollectId extends AbstractId implements Serializable {
    @Column(name =" user_collect_Id")
    private String id;

    public UserCollectId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }
}
