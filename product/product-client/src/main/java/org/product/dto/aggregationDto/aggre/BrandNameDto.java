package org.product.dto.aggregationDto.aggre;

import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.name.BrandName;

@Value
public class BrandNameDto {
    private String UserId;
    private String brandName;

    public void accept(Brand brand) {
        brand.setBrandId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.UserId.class, this.UserId));
        brand.setBrandName(ValueObjectFactory.newInstance(BrandName.class, this.brandName));
    }
}
