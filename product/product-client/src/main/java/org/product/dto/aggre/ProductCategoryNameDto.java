package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.name.ProductCategoryName;

@Data
public class ProductCategoryNameDto {
    private String ProductId;
    private String productCategoryName;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductCategoryName(ValueObjectFactory.newInstance(ProductCategoryName.class, this.productCategoryName));
    }
}
