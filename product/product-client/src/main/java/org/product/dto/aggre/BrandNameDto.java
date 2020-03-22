package org.product.dto.aggre;

import org.product.domain.aggragate.Product;
@Data
public class BrandNameDto {
    private String ProductId;
    private String brandName;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setBrandName(ValueObjectFactory.newInstance(BrandName.class, this.brandName));
    }
}
