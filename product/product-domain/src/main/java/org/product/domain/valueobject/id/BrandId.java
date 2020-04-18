package org.product.domain.valueobject.id;

import lombok.AllArgsConstructor;
import lombok.Value;
import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class BrandId extends AbstractId
{
@Column(name ="   brandId")
private Long   brandId;
}
