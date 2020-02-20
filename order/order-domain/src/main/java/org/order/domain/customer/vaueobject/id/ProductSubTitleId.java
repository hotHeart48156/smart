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
public class ProductSubTitleId extends AbstractId {
    @Column(name = "product_sub_title_id")
    private Long productSubTitleId;
}
