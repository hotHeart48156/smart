package org.activite.domain.valueobject.status;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */

@Embeddable
@AllArgsConstructor
public enum HomeAdvertiseStatus implements Status
{
    ISDEX(1),NOTINDEZ(0);
@Column(name ="   homeAdvertiseStatus")
private  int   homeAdvertiseStatus;
}
