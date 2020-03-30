package org.activite.domain.valueobject.type;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */

@Embeddable
@AllArgsConstructor
public enum RedPacketType implements Type
{
    NORMAL(1),FESTIVAL(2);
@Column(name ="   redPacketType")
private  int   redPacketType;
}
