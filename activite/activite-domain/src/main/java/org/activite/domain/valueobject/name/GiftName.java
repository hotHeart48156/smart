package org.activite.domain.valueobject.name;

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
public class GiftName extends AbstractName
{
@Column(name ="   giftName")
private  Long   giftName;
}
