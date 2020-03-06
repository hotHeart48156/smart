package org.product.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Value;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
/**
 * @author "yangbiao"
 */

@AllArgsConstructor
public interface ValueObject implements ValueObject
{
private String   valueObject;
}
