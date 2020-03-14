package org.product.dto.aggdto;

@Data
public class ProductPromotionPriceDto {
    private String ProductId;
    private String promotionPrice;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPromotionPrice(ValueObjectFactory.newInstance(ProductPromotionPrice.class, this.promotionPrice));
    }
}
