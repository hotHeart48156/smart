package org.activite.domain.valueobject.status;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum RedPacketStatus implements Status
{
RECEIVE(1),UNRECEIVE(0);
@Column(name ="   redPacketStatus")
private  int   redPacketStatus;


}
