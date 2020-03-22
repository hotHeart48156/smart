package org.product.dto.aggre;

@Data
public class ProductSnDto {
    private String ProductId;
    private String productSn;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductSn(ValueObjectFactory.newInstance(ProductSn.class, this.productSn));
    }
}
