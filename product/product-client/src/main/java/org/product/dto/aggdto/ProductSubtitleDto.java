package org.product.dto.aggdto;

@Data
public class ProductSubtitleDto {
    private String ProductId;
    private String productSubtitle;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductSubtitle(ValueObjectFactory.newInstance(ProductSubtitle.class, this.productSubtitle));
    }
}
