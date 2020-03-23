package org.product.dto.aggre.brand;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.name.BrandName;

@Data
public class BrandNameDto extends AbstractBrandDto{
    private String brandName;


    @Override
    public void execute(Brand brand) {
        brand.setBrandName(ValueObjectFactoty.newInstance(BrandName.class,brand));
    }
}
