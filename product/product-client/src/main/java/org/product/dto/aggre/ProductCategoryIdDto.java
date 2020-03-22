package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductCategoryId;

@Data
public class ProductCategoryIdDto {
    private String ProductId;
    private String productCategoryId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, this.productCategoryId));
    }
}
