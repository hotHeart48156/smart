package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductAttributeId;

@Data
public class ProductAttributeIdDto {
    private String ProductId;
    private String productAttributeId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductAttributeId(ValueObjectFactory.newInstance(ProductAttributeId.class, this.productAttributeId));
    }
}
