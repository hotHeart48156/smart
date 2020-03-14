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
public enum ProductAttributeInputType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   productAttributeInputType")
    private int productAttributeInputType;

    public int getProductAttributeInputType() {
        return productAttributeInputType;
    }
}
