package org.product.dto.aggre;

@Data
public class ProductCommentDto {
    private String ProductId;
    private String productComment;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setProductComment(ValueObjectFactory.newInstance(ProductComment.class, this.productComment));
    }
}
