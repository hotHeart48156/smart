package org.product.dto.aggre;

import org.product.domain.aggragate.Product;
@Data
public class ProductPromotionEndTimeDto {
    private String ProductId;
    private String productPromotionEndTime;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPromotionEndTime(ValueObjectFactory.newInstance(ProductPromotionEndTime.class, this.productPromotionEndTime));
    }
}
