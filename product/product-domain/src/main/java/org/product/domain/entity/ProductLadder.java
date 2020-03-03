package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.count.ProductCount;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.price.ProductPrice;

/**
 * @author "yangbiao"
 */
@Data
public class ProductLadder {
    private Id id;
    private ProductId productId;
    private ProductCount productCount;
    private ProductPrice productPrice;
}
