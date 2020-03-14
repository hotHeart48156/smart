package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPromotionPerLimitDto {
    private String UserId;
    private String productPromotionPerLimit;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPromotionPerLimit(ValueObjectFactory.newInstance(ProductPromotionPerLimit.class, this.productPromotionPerLimit));
    }
}
