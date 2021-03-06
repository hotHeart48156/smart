package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Entity
@Data
@Table(name = "productAttribyteCategory")
public class ProductAttributeCategory   implements  org.product.domain.entity.Entity{
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductAttributeCategoryId productAttributeCategoryId;

}
