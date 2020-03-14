package org.product.dto.dto;

@Data
public class FreightTemplateDto {
    private String feightTemplateId;
    private String chargeType;
    private String countFee;

    public void accept(FreightTemplate freighttemplate) {
        freighttemplate.setFeightTemplateId(ValueObjectFactory.newInstance(FeightTemplateId.class, feightTemplateId));
        freighttemplate.setChargeType(ValueObjectFactory.newInstance(ChargeType.class, chargeType));
        freighttemplate.setCountFee(ValueObjectFactory.newInstance(CountFee.class, countFee));
    }
}
