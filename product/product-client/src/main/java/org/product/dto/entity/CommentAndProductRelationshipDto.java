package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.CommentAndProductRelationship;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

@Data
public class CommentAndProductRelationshipDto {
    private String id;
    private String productId;

    public void accept(CommentAndProductRelationship commentandproductrelationship) {
        commentandproductrelationship.setId(ValueObjectFactory.newInstance(Id.class, id));
        commentandproductrelationship.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
    }
}
