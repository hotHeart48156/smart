package org.product.domain.valueobject.sn;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Value;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductSn extends AbstractSn
{
@Column(name ="   productSn")
private Long   productSn;
}
