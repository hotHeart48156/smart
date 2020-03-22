package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.price.ProductPromotionPrice;

@Data
public class ProductPromotionPriceDto {
    private String ProductId;
    private String promotionPrice;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setPromotionPrice(ValueObjectFactory.newInstance(ProductPromotionPrice.class, this.promotionPrice));
    }
}
