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

public class WeixinOpenId extends AbstractId {
    @Column(name ="   weixinOpenId")
private String id;

    public WeixinOpenId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }



}
