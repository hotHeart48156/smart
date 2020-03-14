package org.product.dto.aggregationDto.aggre;

@Value
public class GiftPointDto {
    private String UserId;
    private String giftPoint;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setGiftPoint(ValueObjectFactory.newInstance(GiftPoint.class, this.giftPoint));
    }
}
