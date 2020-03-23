package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.GiftAndProductRelationship;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

@Data
public class GiftAndProductRelationshipDto {
    private String id;
    private String giftId;
    private String productId;

    public void accept(GiftAndProductRelationship giftandproductrelationship) {
        giftandproductrelationship.setId(ValueObjectFactory.newInstance(Id.class, id));
        giftandproductrelationship.setId(ValueObjectFactory.newInstance(Id.class, giftId));
        giftandproductrelationship.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
    }
}
