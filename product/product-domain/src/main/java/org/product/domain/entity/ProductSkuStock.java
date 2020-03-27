package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.SkuCode;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Data
@Entity
public class ProductSkuStock   implements  org.product.domain.entity.Entity{

        @EmbeddedId
     private Id id;
        @Embedded
     private ProductId productId;
        @Embedded
     private SkuCode skuCode;

}
