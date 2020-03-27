package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.FreightTemplate;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.fee.CountFee;
import org.product.domain.valueobject.id.FeightTemplateId;
import org.product.domain.valueobject.type.ChargeType;
@Data
public class FreightTemplateDto   extends AbstractEntityDto{
    private String freightTemplateId;
    private String chargeType;
    private String countFee;

    public void accept(FreightTemplate freighttemplate) {
        freighttemplate.setFeightTemplateId(ValueObjectFactory.newInstance(FeightTemplateId.class, freightTemplateId));
        freighttemplate.setChargeType(ValueObjectFactory.newInstance(ChargeType.class, chargeType));
        freighttemplate.setCountFee(ValueObjectFactory.newInstance(CountFee.class, countFee));
    }
}
