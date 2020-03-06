package org.users.domain.customer.valueobject;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */

@Embeddable
public class ContinueSignPoint implements ValueObject {
@Column(name ="   continueSignPoint")
private Long continueSignPoint;
}
