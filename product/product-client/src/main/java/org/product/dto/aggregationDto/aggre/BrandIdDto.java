package org.product.dto.aggregationDto.aggre;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.BrandId;

@Value
public class BrandIdDto {
    private String UserId;
    private String brandId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.UserId.class, this.UserId));
        product.setBrandId(ValueObjectFactory.newInstance(BrandId.class, this.brandId));
    }
}
