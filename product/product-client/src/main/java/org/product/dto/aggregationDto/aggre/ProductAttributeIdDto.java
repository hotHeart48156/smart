package org.product.dto.aggregationDto.aggre;

@Value
public class ProductAttributeIdDto {
    private String UserId;
    private String productAttributeId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductAttributeId(ValueObjectFactory.newInstance(ProductAttributeId.class, this.productAttributeId));
    }
}
