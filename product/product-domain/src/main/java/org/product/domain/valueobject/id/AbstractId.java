package org.product.domain.valueobject.id;

import lombok.Value;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import org.product.domain.valueobject.ValueObject;

import java.io.Serializable;

/**
 * @author "yangbiao"
 */

public abstract class AbstractId implements ValueObject, Serializable
{
}
