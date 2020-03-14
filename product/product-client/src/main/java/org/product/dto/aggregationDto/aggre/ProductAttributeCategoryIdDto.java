package org.product.dto.aggregationDto.aggre;

@Value
public class ProductAttributeCategoryIdDto {
    private String UserId;
    private String productAttributeCategoryId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, this.productAttributeCategoryId));
    }
}
