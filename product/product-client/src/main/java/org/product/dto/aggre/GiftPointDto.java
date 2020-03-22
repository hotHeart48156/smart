package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.GiftPoint;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class GiftPointDto {
    private String ProductId;
    private String giftPoint;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setGiftPoint(ValueObjectFactory.newInstance(GiftPoint.class, this.giftPoint));
    }
}
