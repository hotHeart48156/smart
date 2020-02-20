package org.order.domain.customer.vaueobject.id;

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
public class ProductSkuId extends AbstractId {
    @Column(name = "", unique = true, nullable = false, length = 100)
    private Long productSkuId;

}
