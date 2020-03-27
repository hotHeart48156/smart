package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.count.ProductCount;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.price.ProductPrice;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class ProductLadder implements org.product.domain.entity.Entity{
       @EmbeddedId
    private Id id;
       @Embedded
    private ProductCount productCount;
       @Embedded
    private ProductPrice productPrice;
}
