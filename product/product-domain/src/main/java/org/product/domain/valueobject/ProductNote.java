package org.product.domain.valueobject;

import lombok.Value;
import javax.persistence.Embeddable;
@AllArgsConstructor
import lombok.AllArgsConstructor;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductNote implements ValueObject
{
private String   productNote;
}
