package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPromotionPriceDto {
    private String UserId;
    private String promotionPrice;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPromotionPrice(ValueObjectFactory.newInstance(ProductPromotionPrice.class, this.promotionPrice));
    }
}
