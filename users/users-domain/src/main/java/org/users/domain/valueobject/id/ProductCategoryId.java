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

public class ProductCategoryId extends AbstractId {
    @Column(name ="   productCategoryId")
private String id;

    public ProductCategoryId() {
        this.id = IdentifierFactory.getInstance().generateIdentifier();
    }



}
