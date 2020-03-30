package org.activite.domain.valueobject.status;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */

@Embeddable
@AllArgsConstructor
public enum GiftStatus implements Status
{
    VALID(1),INVALID(0);
    @Column(name ="giftStatus")
private  int   giftStatus;
}
