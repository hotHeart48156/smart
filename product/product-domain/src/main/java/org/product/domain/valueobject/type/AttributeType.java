package org.product.domain.valueobject.type;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum AttributeType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   attributeType")
    private int attributeType;

    public int getAttributeType() {
        return attributeType;
    }
}
