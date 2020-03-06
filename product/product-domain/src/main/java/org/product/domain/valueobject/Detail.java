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
public class Detail implements ValueObject
{
@Column(name = "detail")
private String   detail;


}
