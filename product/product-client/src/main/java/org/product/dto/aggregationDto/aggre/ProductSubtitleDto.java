package org.product.dto.aggregationDto.aggre;

@Value
public class ProductSubtitleDto {
    private String UserId;
    private String productSubtitle;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductSubtitle(ValueObjectFactory.newInstance(ProductSubtitle.class, this.productSubtitle));
    }
}
