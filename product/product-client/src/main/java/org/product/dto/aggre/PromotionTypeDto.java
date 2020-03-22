package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.type.PromotionType;

@Data
public class PromotionTypeDto {
    private String ProductId;
    private String promotionType;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setPromotionType(ValueObjectFactory.newInstance(PromotionType.class, this.promotionType));
    }
}
