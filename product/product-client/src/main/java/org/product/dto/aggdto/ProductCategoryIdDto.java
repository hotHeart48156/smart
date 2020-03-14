package org.product.dto.aggdto;

@Data
public class ProductCategoryIdDto {
    private String ProductId;
    private String productCategoryId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, this.productCategoryId));
    }
}
