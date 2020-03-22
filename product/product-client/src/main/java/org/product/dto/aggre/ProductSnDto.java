package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.sn.ProductSn;

@Data
public class ProductSnDto {
    private String ProductId;
    private String productSn;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductSn(ValueObjectFactory.newInstance(ProductSn.class, this.productSn));
    }
}
