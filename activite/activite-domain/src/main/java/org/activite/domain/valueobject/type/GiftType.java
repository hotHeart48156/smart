package org.activite.domain.valueobject.type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum GiftType implements Type{
    FIRSTTIMEGIFT(1),REACHGIFT(2),SIGLEGIFT(3);


@Column(name ="giftType")
private  int   giftType;
GiftType(int type){
    this.giftType=type;
}

    public int getGiftType() {
        return giftType;
    }
}
