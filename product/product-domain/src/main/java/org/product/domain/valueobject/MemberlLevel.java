package org.product.domain.valueobject;

import lombok.Value;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class MemberlLevel implements ValueObject
{
private String   memberlLevel;
}
