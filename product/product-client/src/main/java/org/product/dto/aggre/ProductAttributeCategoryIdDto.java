package org.product.dto.aggre;

@Data
public class ProductAttributeCategoryIdDto {
    private String ProductId;
    private String productAttributeCategoryId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, this.productAttributeCategoryId));
    }
}
