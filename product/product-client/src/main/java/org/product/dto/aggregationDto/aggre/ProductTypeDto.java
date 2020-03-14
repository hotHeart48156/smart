package org.product.dto.aggregationDto.aggre;

@Value
public class ProductTypeDto {
    private String UserId;
    private String productType;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductType(ValueObjectFactory.newInstance(ProductType.class, this.productType));
    }
}
