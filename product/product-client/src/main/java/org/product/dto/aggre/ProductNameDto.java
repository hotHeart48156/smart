package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.name.ProductName;

@Data
public class ProductNameDto {
    private String ProductId;
    private String productName;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductName(ValueObjectFactory.newInstance(ProductName.class, this.productName));
    }
}
