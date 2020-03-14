package org.product.dto.aggdto;

@Data
public class GiftPointDto {
    private String ProductId;
    private String giftPoint;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setGiftPoint(ValueObjectFactory.newInstance(GiftPoint.class, this.giftPoint));
    }
}
