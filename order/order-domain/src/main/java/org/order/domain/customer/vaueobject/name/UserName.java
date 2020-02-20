package org.order.domain.customer.vaueobject.name;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.SqlResultSetMapping;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class UserName extends AbstractName {
    @Column(name = "user_name")
    private String userName;
}
