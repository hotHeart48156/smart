package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.type.ProductType;

@Data
public class ProductTypeDto {
    private String ProductId;
    private String productType;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductType(ValueObjectFactory.newInstance(ProductType.class, this.productType));
    }
}
