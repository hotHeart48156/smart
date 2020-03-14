package org.product.dto.aggdto;

@Data
public class GiftGrowthDto {
    private String ProductId;
    private String giftGrowth;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setGiftGrowth(ValueObjectFactory.newInstance(GiftGrowth.class, this.giftGrowth));
    }
}