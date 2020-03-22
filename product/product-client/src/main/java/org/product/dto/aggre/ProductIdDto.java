package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductId;

@Data
public class ProductIdDto {
    private String ProductId;
    private String productId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.productId));
    }
}
