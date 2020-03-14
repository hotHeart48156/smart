package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPromotionEndTimeDto {
    private String UserId;
    private String productPromotionEndTime;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPromotionEndTime(ValueObjectFactory.newInstance(ProductPromotionEndTime.class, this.productPromotionEndTime));
    }
}
