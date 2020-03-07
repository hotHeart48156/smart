package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class PostCode implements ValueObject {
    @Column(name ="   postCode")
private String postCode;
}
