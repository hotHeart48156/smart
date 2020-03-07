package org.activite.domain.valueobject.count;

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
public class RedPacketStock extends AbstractCount
{
@Column(name ="   redPacketStock")
private  Long   redPacketStock;
}
