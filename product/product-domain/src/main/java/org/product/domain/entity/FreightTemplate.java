package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.fee.CountFee;
import org.product.domain.valueobject.id.FeightTemplateId;
import org.product.domain.valueobject.type.ChargeType;

/**
 * @author "yangbiao"
 */
@Data
public class FreightTemplate implements Entity {
    private FeightTemplateId feightTemplateId;
    private ChargeType chargeType;
    private CountFee countFee;

}
