package org.order.domain.customer.vaueobject.name;

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
public class PromoteName extends AbstractName {
    @Column(name = "promote_name")
    private String promoteName;

}
