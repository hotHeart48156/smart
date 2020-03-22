package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;

@Data
public class ProductAttributeCategoryIdDto {
    private String ProductId;
    private String productAttributeCategoryId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, this.productAttributeCategoryId));
    }
}
