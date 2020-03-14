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
public class GrowthChangeHistoryId extends AbstractId {
    @Column(name = " GrowthChangeHistoryId")
    private String id;

    public GrowthChangeHistoryId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }

}
