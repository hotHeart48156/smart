package org.product.dto.aggregationDto.aggre;

@Value
public class ProductOriginalPriceDto {
    private String UserId;
    private String originalPrice;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductOriginalPrice(ValueObjectFactory.newInstance(ProductOriginalPrice.class, this.originalPrice));
    }
}
