package org.product.dto.aggdto;

@Data
public class ProductKeywordsDto {
    private String ProductId;
    private String productKeywords;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductKeywords(ValueObjectFactory.newInstance(ProductKeywords.class, this.productKeywords));
    }
}
