package org.product.dtoo.aggdto;

@Data
public class ProductOriginalPriceDto {
    private String ProductId;
    private String originalPrice;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductOriginalPrice(ValueObjectFactory.newInstance(ProductOriginalPrice.class, this.originalPrice));
    }
}
