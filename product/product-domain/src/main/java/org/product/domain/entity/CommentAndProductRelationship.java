package org.product.domain.entity;

import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

/**
 * @author yangbiao
 */

public class CommentAndProductRelationship {
    private Id id;
    private ProductId productId;
    protected CommentId commentId;
}
