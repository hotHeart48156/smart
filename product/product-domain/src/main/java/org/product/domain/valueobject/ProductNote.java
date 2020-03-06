package org.product.domain.valueobject;

import lombok.AllArgsConstructor;
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
public class ProductNote implements ValueObject
{
@Column(name ="   productNote")
private String   productNote;
}
