package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class ConsumePerPoint implements ValueObject {
    @Column(name ="   consumePerPoint")
private Long point;
}
