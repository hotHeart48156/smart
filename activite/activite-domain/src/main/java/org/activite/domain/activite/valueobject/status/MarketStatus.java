package org.activite.domain.activite.valueobject.status;

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
public enum MarketStatus implements Status
{
@Column(status ="   marketStatus")
private  int   marketStatus;
}
