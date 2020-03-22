package org.product.dto.aggre;

@Data
public class ProductCategoryNameDto {
    private String ProductId;
    private String productCategoryName;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductCategoryName(ValueObjectFactory.newInstance(ProductCategoryName.class, this.productCategoryName));
    }
}
