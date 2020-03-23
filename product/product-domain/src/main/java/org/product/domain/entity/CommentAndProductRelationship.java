package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author yangbiao
 */
@javax.persistence.Entity

@Data
public class CommentAndProductRelationship {
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private CommentId commentId;
}
