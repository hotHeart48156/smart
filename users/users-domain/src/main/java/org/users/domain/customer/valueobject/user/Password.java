package org.users.domain.customer.valueobject.user;

import lombok.Value;
import org.users.domain.customer.valueobject.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class Password implements ValueObject {
    @Column(name = "password")
    @Column(name ="   password")
private String password;
}
