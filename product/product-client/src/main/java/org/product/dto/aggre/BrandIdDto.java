package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.BrandId;

@Data
public class BrandIdDto {
    private String ProductId;
    private String brandId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setBrandId(ValueObjectFactory.newInstance(BrandId.class, this.brandId));
    }
}
