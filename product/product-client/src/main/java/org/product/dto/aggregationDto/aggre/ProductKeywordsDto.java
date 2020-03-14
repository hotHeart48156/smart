package org.product.dto.aggregationDto.aggre;

@Value
public class ProductKeywordsDto {
    private String UserId;
    private String productKeywords;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductKeywords(ValueObjectFactory.newInstance(ProductKeywords.class, this.productKeywords));
    }
}
