package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author yangbiao
 */
@javax.persistence.Entity

@Data
@Table(name = "commenteAndProductRelationship")
public class CommentAndProductRelationship implements org.product.domain.entity.Entity{
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private CommentId commentId;
}
