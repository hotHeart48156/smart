package org.activite.domain.valueobject.status;

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
public enum RecommendStatus implements Status
{
@Column(status ="   recommendStatus")
private  int   recommendStatus;
}
