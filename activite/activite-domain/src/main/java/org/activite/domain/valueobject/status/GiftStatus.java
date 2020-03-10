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
public enum GiftStatus implements Status
{
@Column(status ="   giftStatus")
private  int   giftStatus;
}