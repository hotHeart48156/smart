package org.product.dto.aggregationDto.aggre;

import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.FactoryStatus;

@Value
public class FactoryStatusDto {
    private String UserId;
    private String factoryStatus;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.UserId.class, this.UserId));
        brand.setFactoryStatus(ValueObjectFactory.newInstance(FactoryStatus.class, this.factoryStatus));
    }
}
