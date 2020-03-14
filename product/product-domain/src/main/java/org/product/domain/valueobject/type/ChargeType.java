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
public enum ChargeType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   chargeType")
    private int chargeType;

    public int getChargeType() {
        return chargeType;
    }
}
