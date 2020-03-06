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
public class ProductKeywords implements ValueObject
{
@Column(name ="   productKeywords")
private String   productKeywords;
}
