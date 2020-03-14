package org.product.dto.aggdto;

@Data
public class ProductPriceDto {
    private String ProductId;
    private String productPrice;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, this.productPrice));
    }
}
