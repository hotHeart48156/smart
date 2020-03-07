package org.order.domain.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class Growth implements ValueObject {
    @Column(name = "growth")
    private Integer growth;

}
