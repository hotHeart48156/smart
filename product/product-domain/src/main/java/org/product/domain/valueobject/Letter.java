package org.product.domain.valueobject;

import lombok.Value;

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
public class Letter implements ValueObject
{
@Column(name ="   letter ")
private String letter;

}