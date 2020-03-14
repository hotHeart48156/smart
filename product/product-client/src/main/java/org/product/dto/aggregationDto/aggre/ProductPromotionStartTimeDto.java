package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPromotionStartTimeDto {
    private String UserId;
    private String productPromotionStartTime;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPromotionStartTime(ValueObjectFactory.newInstance(ProductPromotionStartTime.class, this.productPromotionStartTime));
    }
}
