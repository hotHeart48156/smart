package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPriceDto {
    private String UserId;
    private String productPrice;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, this.productPrice));
    }
}
