package org.product.domain.valueobject.status;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class RelatesStatus extends AbstractStatus
{
@Column(name ="   relatesStatus")
private BigDecimal    relatesStatus;
private int    relatesStatus;
}
