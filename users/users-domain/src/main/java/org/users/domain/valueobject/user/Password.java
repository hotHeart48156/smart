package org.users.domain.valueobject.user;

import lombok.Value;
import org.users.domain.valueobject.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class Password implements ValueObject {
    @Column(name ="   password")
private String password;
}
