package org.product.domain.entity;

import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.price.FullPrice;
import org.product.domain.valueobject.price.ReducePrice;

/**
 * @author "yangbiao"
 */
public class ProductFullReduction {
    private Id id;
    private ProductId productId;
    private FullPrice fullPrice;
    private ReducePrice reducePrice;

}
