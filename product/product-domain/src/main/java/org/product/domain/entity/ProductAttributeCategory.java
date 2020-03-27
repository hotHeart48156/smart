package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class ProductAttributeCategory   implements  org.product.domain.entity.Entity{
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductAttributeCategoryId productAttributeCategoryId;

}
