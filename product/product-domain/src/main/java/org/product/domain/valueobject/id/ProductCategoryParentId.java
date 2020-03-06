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
public class ProductCategoryParentId extends AbstractId
{
@Column(name ="   productCategoryParentId")
private String   productCategoryParentId;
}
