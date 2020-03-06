package org.users.domain.customer.valueobject;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */

@Embeddable
public class Growth implements ValueObject {
    @Column(name ="   growth")
private Long growth;
}
