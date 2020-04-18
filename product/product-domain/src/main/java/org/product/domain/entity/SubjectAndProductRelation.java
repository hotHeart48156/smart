package org.product.domain.entity;

import org.product.domain.valueobject.id.ProductId;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Table(name = "subjectAndProductRelationship")

public class SubjectAndProductRelation implements org.product.domain.entity.Entity{
@EmbeddedId
    private ProductId productId;
}
