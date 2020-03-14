package org.product.dto.aggregationDto.aggre;

@Value
public class ProductCategoryIdDto {
    private String UserId;
    private String productCategoryId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, this.productCategoryId));
    }
}
