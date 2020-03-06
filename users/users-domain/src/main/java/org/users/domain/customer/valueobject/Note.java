package org.users.domain.customer.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class Note implements ValueObject {
    @Column(name ="   note")
private   String note;
}
