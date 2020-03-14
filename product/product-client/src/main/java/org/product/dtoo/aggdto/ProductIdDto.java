package org.product.dtoo.aggdto;

@Data
public class ProductIdDto {
    private String ProductId;
    private String productId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.productId));
    }
}
