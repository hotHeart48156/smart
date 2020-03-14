package org.users.domain.dto.entity;

@Data
public class IntegrationConsumeSettingDto {
    private String id;
    private String deductionPerAmount;
    private String maxPointPerOrder;

    public void accept(IntegrationConsumeSetting integrationconsumesetting) {
        integrationconsumesetting.setId(ValueObjectFactory.newInstance(Id.class, id));
        integrationconsumesetting.setDeductionPerAmount(ValueObjectFactory.newInstance(DeductionPerAmount.class, deductionPerAmount));
        integrationconsumesetting.setMaxPointPerOrder(ValueObjectFactory.newInstance(MaxPointPerOrder.class, maxPointPerOrder));
    }
}
