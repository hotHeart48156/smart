package org.product.dtoo.aggdto;

@Data
public class ProductPromotionStartTimeDto {
    private String ProductId;
    private String productPromotionStartTime;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPromotionStartTime(ValueObjectFactory.newInstance(ProductPromotionStartTime.class, this.productPromotionStartTime));
    }
}
