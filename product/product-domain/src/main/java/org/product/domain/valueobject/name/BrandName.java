package org.product.domain.valueobject.name;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Embeddable
public class BrandName {
@Column(name ="   brandName")
private   String brandName;
}
