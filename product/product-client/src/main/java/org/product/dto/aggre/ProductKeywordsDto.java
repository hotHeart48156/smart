package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductKeywords;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductKeywordsDto {
    private String ProductId;
    private String productKeywords;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductKeywords(ValueObjectFactory.newInstance(ProductKeywords.class, this.productKeywords));
    }
}
