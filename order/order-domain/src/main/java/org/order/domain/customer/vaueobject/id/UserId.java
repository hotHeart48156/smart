package org.order.domain.customer.vaueobject.id;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.apache.catalina.User;
import org.axonframework.common.IdentifierFactory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class UserId extends AbstractId {
    @Column(name = "user_id")
    private String id;


}
