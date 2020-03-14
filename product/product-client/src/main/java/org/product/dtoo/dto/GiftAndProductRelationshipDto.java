package org.product.dtoo.dto;

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
