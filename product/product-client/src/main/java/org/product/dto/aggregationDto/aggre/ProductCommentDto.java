package org.product.dto.aggregationDto.aggre;

@Value
public class ProductCommentDto {
    private String UserId;
    private String productComment;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setProductComment(ValueObjectFactory.newInstance(ProductComment.class, this.productComment));
    }
}
