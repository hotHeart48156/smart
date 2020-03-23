package org.product.dto.aggre.brand;

import org.product.domain.aggragate.Brand;
import org.product.dto.AbstractDto;

/**
 * @author yangbiao
 */

public abstract class AbstractBrandDto extends AbstractDto {
    private String brandId;
    public void accept(Brand brand){
        if (brand.getBrandId().getId().equals(brandId)){
            execute(brand);
        }
    }
    public abstract void execute(Brand brand);
}
