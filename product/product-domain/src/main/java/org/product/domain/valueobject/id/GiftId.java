package org.product.domain.valueobject.id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
@AllArgsConstructor
public class GiftId extends AbstractId {
    @Column(name ="   giftId")
 Long   id;
}
