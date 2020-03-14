package org.product.dto.aggregationDto.aggre;

@Value
public class ProductIdDto {
    private String UserId;
    private String productId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.productId));
    }
}
