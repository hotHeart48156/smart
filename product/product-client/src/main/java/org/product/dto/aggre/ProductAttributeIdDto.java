package org.product.dto.aggre;

@Data
public class ProductAttributeIdDto {
    private String ProductId;
    private String productAttributeId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductAttributeId(ValueObjectFactory.newInstance(ProductAttributeId.class, this.productAttributeId));
    }
}
