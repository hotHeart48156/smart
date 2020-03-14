package org.product.dto.aggregationDto.aggre;

@Value
public class ProductDescriptionDto {
    private String UserId;
    private String productDescription;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductDescription(ValueObjectFactory.newInstance(ProductDescription.class, this.productDescription));
    }
}
