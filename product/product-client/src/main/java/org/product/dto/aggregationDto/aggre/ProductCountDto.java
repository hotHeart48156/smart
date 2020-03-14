package org.product.dto.aggregationDto.aggre;

@Value
public class ProductCountDto {
    private String UserId;
    private String productCount;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setProductCount(ValueObjectFactory.newInstance(ProductCount.class, this.productCount));
    }
}
