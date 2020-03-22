package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.domain.valueobject.DeductionPerAmount;
import org.users.domain.valueobject.MaxPointPerOrder;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.Id;

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
