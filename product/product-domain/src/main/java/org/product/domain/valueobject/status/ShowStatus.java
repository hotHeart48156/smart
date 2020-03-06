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
public class ShowStatus extends AbstractStatus
{
@Column(name ="   showStatus")
private BigDecimal    showStatus;
private int    showStatus;
}
