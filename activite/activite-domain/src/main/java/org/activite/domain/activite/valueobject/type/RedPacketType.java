package org.activite.domain.activite.valueobject.type;

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
public enum RedPacketType implements Type
{
@Column(type ="   redPacketType")
private  int   redPacketType;
}
