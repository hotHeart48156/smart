package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductStock;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductStockDto {
    private String ProductId;
    private String productStock;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductStock(ValueObjectFactory.newInstance(ProductStock.class, this.productStock));
    }
}
