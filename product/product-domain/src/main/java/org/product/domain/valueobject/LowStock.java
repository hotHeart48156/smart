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
public class LowStock implements ValueObject
{
@Column(name ="   lowStock")

private String   lowStock;
}
