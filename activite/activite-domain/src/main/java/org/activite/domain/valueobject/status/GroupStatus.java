package org.activite.domain.valueobject.status;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum GroupStatus implements Status
{
    ENABLE(1),DISABLE(0);

    @Column(name ="groupStatus")
private  int   groupStatus;
}
