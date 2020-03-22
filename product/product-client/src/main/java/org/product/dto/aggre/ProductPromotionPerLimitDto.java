package org.product.dto.aggre;

import org.product.domain.aggragate.Product;
@Data
public class ProductPromotionPerLimitDto {
    private String ProductId;
    private String productPromotionPerLimit;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPromotionPerLimit(ValueObjectFactory.newInstance(ProductPromotionPerLimit.class, this.productPromotionPerLimit));
    }
}
