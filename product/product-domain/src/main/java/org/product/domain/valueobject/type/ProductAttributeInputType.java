package org.product.domain.valueobject.type;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public enum  ProductAttributeInputType implements AbstractType
{
@Column(name ="   productAttributeInputType")
private  int   productAttributeInputType;
}
