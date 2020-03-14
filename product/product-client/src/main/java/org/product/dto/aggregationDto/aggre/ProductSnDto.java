package org.product.dto.aggregationDto.aggre;

@Value
public class ProductSnDto {
    private String UserId;
    private String productSn;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductSn(ValueObjectFactory.newInstance(ProductSn.class, this.productSn));
    }
}
