package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductSubtitle;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductSubtitleDto {
    private String ProductId;
    private String productSubtitle;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductSubtitle(ValueObjectFactory.newInstance(ProductSubtitle.class, this.productSubtitle));
    }
}
