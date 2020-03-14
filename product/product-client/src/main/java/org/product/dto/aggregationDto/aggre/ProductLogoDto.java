package org.product.dto.aggregationDto.aggre;

@Value
public class ProductLogoDto {
    private String UserId;
    private String productLogo;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setProductLogo(ValueObjectFactory.newInstance(ProductLogo.class, this.productLogo));
    }
}
