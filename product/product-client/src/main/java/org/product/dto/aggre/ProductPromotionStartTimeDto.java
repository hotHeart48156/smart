package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.time.ProductPromotionStartTime;

@Data
public class ProductPromotionStartTimeDto {
    private String ProductId;
    private String productPromotionStartTime;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductPromotionStartTime(ValueObjectFactory.newInstance(ProductPromotionStartTime.class, this.productPromotionStartTime));
    }
}
