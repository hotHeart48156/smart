package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.price.FullPrice;
import org.product.domain.valueobject.price.ReducePrice;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
public class ProductFullReduction {
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private FullPrice fullPrice;
     @Embedded
    private ReducePrice reducePrice;

}
