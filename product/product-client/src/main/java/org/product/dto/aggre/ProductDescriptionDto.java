package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductDescription;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductDescriptionDto {
    private String ProductId;
    private String productDescription;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductDescription(ValueObjectFactory.newInstance(ProductDescription.class, this.productDescription));
    }
}
