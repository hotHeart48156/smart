package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.GiftGrowth;
import org.product.domain.valueobject.ValueObjectFactory;
@Data
public class GiftGrowthDto {
    private String ProductId;
    private String giftGrowth;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setGiftGrowth(ValueObjectFactory.newInstance(GiftGrowth.class, this.giftGrowth));
    }
}
