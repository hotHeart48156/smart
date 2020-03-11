package org.product.domain.valueobject.name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable

public class MemberName  extends AbstractName{
@Column(name ="   memberName")
private   String memberName;
}
