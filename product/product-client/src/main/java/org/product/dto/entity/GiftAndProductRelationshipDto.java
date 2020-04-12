package org.product.dto.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.product.domain.entity.GiftAndProductRelationship;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.GiftId;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
@EqualsAndHashCode(callSuper = true)
@Data
public class GiftAndProductRelationshipDto   extends AbstractEntityDto{
    private String id;
    private String giftId;
    private String productId;
    public void accept(GiftAndProductRelationship giftandproductrelationship) {
        giftandproductrelationship.setId(ValueObjectFactory.newInstance(Id.class, id));
        giftandproductrelationship.setGiftId(ValueObjectFactory.newInstance(GiftId.class, giftId));
        giftandproductrelationship.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));

    }
}
