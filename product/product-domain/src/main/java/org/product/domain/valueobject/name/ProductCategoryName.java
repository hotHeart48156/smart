package org.product.domain.valueobject.name;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
public class ProductCategoryName  extends AbstractName{
@Column(name ="   productCategoryName")
private  String   productCategoryName;
}
