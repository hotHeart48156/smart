package org.product.dto.aggre;

@Data
public class BrandNameDto {
    private String ProductId;
    private String brandName;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setBrandName(ValueObjectFactory.newInstance(BrandName.class, this.brandName));
    }
}
