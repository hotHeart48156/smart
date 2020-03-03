package org.product.domain.entity;

import org.product.domain.valueobject.SkuCode;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

/**
 * @author "yangbiao"
 */
public class ProductSkuStock {
    private Id id;
    private ProductId productId;
    private SkuCode skuCode;

}
