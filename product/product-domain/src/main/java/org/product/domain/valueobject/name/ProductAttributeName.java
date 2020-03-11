package org.product.domain.valueobject.name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable

public class ProductAttributeName extends AbstractName{
@Column(name ="   productAttributeName")
private   String  productAttributeName;
}
