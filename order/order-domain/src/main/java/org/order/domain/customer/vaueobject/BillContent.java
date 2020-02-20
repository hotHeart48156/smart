package org.order.domain.customer.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode
@Value
@Embeddable
public class BillContent implements ValueObject {
    @Column(name = "bill_content")
    private String billContent;
}
