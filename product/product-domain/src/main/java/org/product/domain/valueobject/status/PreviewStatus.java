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
public class PreviewStatus extends AbstractStatus
{
@Column(name ="   previewStatus")
private BigDecimal    previewStatus;
private int    previewStatus;
}
