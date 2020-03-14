package org.product.dto.aggdto;

@Data
public class ProductLogoDto {
    private String ProductId;
    private String productLogo;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setProductLogo(ValueObjectFactory.newInstance(ProductLogo.class, this.productLogo));
    }
}
