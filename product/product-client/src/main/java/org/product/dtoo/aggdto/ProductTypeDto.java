package org.product.dtoo.aggdto;

@Data
public class ProductTypeDto {
    private String ProductId;
    private String productType;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductType(ValueObjectFactory.newInstance(ProductType.class, this.productType));
    }
}
