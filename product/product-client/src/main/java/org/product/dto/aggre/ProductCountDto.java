package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ProductCount;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductCountDto {
    private String ProductId;
    private String productCount;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        brand.setProductCount(ValueObjectFactory.newInstance(ProductCount.class, this.productCount));
    }
}
