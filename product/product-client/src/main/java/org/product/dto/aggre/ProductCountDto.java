package org.product.dto.aggre;

@Data
public class ProductCountDto {
    private String ProductId;
    private String productCount;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setProductCount(ValueObjectFactory.newInstance(ProductCount.class, this.productCount));
    }
}
