package org.product.dto.aggregationDto.aggre;

@Value
public class ProductCategoryNameDto {
    private String UserId;
    private String productCategoryName;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductCategoryName(ValueObjectFactory.newInstance(ProductCategoryName.class, this.productCategoryName));
    }
}
