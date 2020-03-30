package org.activite.domain.valueobject.type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum SmallType implements Type
{
AMOUNT(1),QUANTITY(2);
@Column(name ="smallType")
private  int   smallType;

   SmallType(int type) {
        this.smallType=type;
    }
    SmallType(){}

    public int getSmallType() {
        return smallType;
    }
}
