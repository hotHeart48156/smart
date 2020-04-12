package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.price.FullPrice;
import org.product.domain.valueobject.price.ReducePrice;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name = "productFullReduction")

public class ProductFullReduction implements org.product.domain.entity.Entity {
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private FullPrice fullPrice;
     @Embedded
    private ReducePrice reducePrice;

}
