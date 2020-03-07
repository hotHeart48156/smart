package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class MinimalPointPerOrder implements ValueObject {
    @Column(name ="   minimalPointPerOrder")
private   String point;
}
