package org.order.domain.vaueobject;

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
public class Note implements ValueObject {
    @Column(name = "note")
    private String note;

}
