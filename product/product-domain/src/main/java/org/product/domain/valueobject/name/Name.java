package org.product.domain.valueobject.name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable

public class Name extends AbstractName {
@Column(name ="   name")
private String    name;
}
