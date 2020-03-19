package org.activite.domain.valueobject.type;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum GiftType implements Type
{ENABLE(1),DISABLE（0);
@Column(name ="   giftType")
private  int   giftType;
GiftType(int type){
    this.giftType=type;
}
GiftType(){}
}
