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
public enum ProductAttributeSelectType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   productAttributeSelectType")
    private int productAttributeSelectType;

    public int getProductAttributeSelectType() {
        return productAttributeSelectType;
    }
}
