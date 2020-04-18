package org.product.domain.valueobject.id;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductCategoryParentId extends AbstractId
{
@Column(name ="   productCategoryParentId")
private Long   productCategoryParentId;
}
