package org.users.domain.customer.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class GoodsPic implements ValueObject {
    @Column(name ="   goodsPic")
private String picUrl;
}
