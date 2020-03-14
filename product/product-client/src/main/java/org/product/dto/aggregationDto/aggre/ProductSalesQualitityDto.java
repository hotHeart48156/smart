package org.product.dto.aggregationDto.aggre;

@Value
public class ProductSalesQualitityDto {
    private String UserId;
    private String productSalesQualitity;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductSalesQualitity(ValueObjectFactory.newInstance(ProductSalesQualitity.class, this.productSalesQualitity));
    }
}
