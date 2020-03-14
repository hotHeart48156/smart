package org.product.dtoo.aggdto;

@Data
public class PromotionTypeDto {
    private String ProductId;
    private String promotionType;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setPromotionType(ValueObjectFactory.newInstance(PromotionType.class, this.promotionType));
    }
}
