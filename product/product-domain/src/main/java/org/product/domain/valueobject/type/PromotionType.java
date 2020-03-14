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
public enum PromotionType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   promotionType")
    private int promotionType;

    public int getPromotionType() {
        return promotionType;
    }
}
