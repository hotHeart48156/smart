package org.product.domain.valueobject.name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
public class ProductName extends AbstractName{
@Column(name ="   productName")
private  String   productName;
}
