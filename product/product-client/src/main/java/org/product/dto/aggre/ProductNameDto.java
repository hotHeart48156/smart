package org.product.dto.aggre;

@Data
public class ProductNameDto {
    private String ProductId;
    private String productName;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductName(ValueObjectFactory.newInstance(ProductName.class, this.productName));
    }
}
