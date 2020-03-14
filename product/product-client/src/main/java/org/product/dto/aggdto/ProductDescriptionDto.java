package org.product.dto.aggdto;

@Data
public class ProductDescriptionDto {
    private String ProductId;
    private String productDescription;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductDescription(ValueObjectFactory.newInstance(ProductDescription.class, this.productDescription));
    }
}
