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
public enum  ProductAttributeSelectType implements AbstractType
{
@Column(name ="   productAttributeSelectType")
private  int   productAttributeSelectType;
}
