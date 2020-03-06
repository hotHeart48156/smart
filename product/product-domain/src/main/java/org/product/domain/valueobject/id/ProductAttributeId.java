package org.product.domain.valueobject.id;

import lombok.Value;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductAttributeId extends AbstractId
{
@Column(name ="   productAttributeId")
private String   productAttributeId;
}
