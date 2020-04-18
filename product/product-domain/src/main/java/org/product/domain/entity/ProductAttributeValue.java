package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name = "productAttributeValue")

public class ProductAttributeValue  implements org.product.domain.entity.Entity{
    @EmbeddedId
    private ProductId productId;
}
