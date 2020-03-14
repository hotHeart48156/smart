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
public class PromotionId extends AbstractId {
    @Column(name = "promotionId")
    private String id;
}
