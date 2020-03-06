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
public class PublishStatus extends AbstractStatus
{
@Column(name ="   publishStatus")
private BigDecimal    publishStatus;
private int    publishStatus;
}
