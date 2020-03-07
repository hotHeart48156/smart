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
public class Email implements ValueObject {
    @javax.validation.constraints.Email(message = "email error")
    @Column(name = "email")
    private String email;

    Email(String email) {
        this.email = email;
    }


}
