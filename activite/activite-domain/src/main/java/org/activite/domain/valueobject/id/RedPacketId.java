package org.activite.domain.valueobject.id;

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
public class RedPacketId extends AbstractId
{
@Column(name ="   redPacketId")
private  Long   redPacketId;
}
