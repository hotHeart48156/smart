package org.product.dtoo.dto;

@Data
public class CommentAndProductRelationshipDto {
    private String id;
    private String productId;

    public void accept(CommentAndProductRelationship commentandproductrelationship) {
        commentandproductrelationship.setId(ValueObjectFactory.newInstance(Id.class, id));
        commentandproductrelationship.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
    }
}
