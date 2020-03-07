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

public class MemberLevelId extends AbstractId {
    @Column(name ="   memberLevelId")
private String id;

    public MemberLevelId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }



}
