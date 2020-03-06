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
public class ProductAttributeCategoryId extends AbstractId
{
@Column(name ="   productAttributeCategoryId")
private String   productAttributeCategoryId;
}
