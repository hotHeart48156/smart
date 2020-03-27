package org.activite.domain.valueobject.id;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class GiftId extends AbstractId
{
@Column(name ="   giftId")
private  Long   giftId;
}
