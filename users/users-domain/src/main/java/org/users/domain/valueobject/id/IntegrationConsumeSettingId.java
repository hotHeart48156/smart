package org.users.domain.valueobject.id;

import lombok.Value;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Value
public class IntegrationConsumeSettingId extends AbstractId{
    @Column(name = "  IntegrationConsumeSettingId")
    private String id;

    public IntegrationConsumeSettingId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }

}
