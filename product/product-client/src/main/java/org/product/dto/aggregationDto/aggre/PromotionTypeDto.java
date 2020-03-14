package org.product.dto.aggregationDto.aggre;

@Value
public class PromotionTypeDto {
    private String UserId;
    private String promotionType;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setPromotionType(ValueObjectFactory.newInstance(PromotionType.class, this.promotionType));
    }
}
