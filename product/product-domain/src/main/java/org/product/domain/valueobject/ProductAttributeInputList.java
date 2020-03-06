package org.product.domain.valueobject;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
  
import lombok.AllArgsConstructor;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductAttributeInputList implements ValueObject
{
@Column(name ="   productAttributeInputList")
private String   productAttributeInputList;
}
