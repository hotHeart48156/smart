package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.SkuCode;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Data
@Entity
public class ProductSkuStock {
    private Id id;
    private ProductId productId;
    private SkuCode skuCode;

}
