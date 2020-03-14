package org.product.dto.aggregationDto.aggre;

@Value
public class ProductNameDto {
    private String UserId;
    private String productName;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductName(ValueObjectFactory.newInstance(ProductName.class, this.productName));
    }
}
