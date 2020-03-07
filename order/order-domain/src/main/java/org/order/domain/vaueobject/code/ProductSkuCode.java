package org.order.domain.vaueobject.code;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class ProductSkuCode extends AbstractCode {
    @Column(name = "product_sku_code")
    private String productSkuCode;

}
