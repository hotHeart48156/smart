package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductSalesQualitity;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductSalesQualitityDto {
    private String ProductId;
    private String productSalesQualitity;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductSalesQualitity(ValueObjectFactory.newInstance(ProductSalesQualitity.class, this.productSalesQualitity));
    }
}
