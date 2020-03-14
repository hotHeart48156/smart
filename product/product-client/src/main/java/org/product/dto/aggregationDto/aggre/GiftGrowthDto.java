package org.product.dto.aggregationDto.aggre;

@Value
public class GiftGrowthDto {
    private String UserId;
    private String giftGrowth;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setGiftGrowth(ValueObjectFactory.newInstance(GiftGrowth.class, this.giftGrowth));
    }
}
