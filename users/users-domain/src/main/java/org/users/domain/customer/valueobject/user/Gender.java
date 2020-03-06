package org.users.domain.customer.valueobject.user;

import org.users.domain.customer.valueobject.ValueObject;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum Gender implements ValueObject {
    MAIL(1), FEMAIL(2), NOTKNOW(0);
    @Column(name ="   gender")
private int index;

    Gender(int i) {
        this.index = i;
    }
}
