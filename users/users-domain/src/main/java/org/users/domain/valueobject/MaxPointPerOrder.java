package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class MaxPointPerOrder implements ValueObject {
    @Column(name ="   maxPointPerOrder")
private  String point;
}
