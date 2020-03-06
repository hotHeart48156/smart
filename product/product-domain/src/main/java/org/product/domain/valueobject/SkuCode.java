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
public class SkuCode implements ValueObject
{

@Column(name ="   skuCode")

private String   skuCode;
}
