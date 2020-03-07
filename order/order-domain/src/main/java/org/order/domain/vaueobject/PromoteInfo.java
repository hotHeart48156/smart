package org.order.domain.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class PromoteInfo implements ValueObject {
    @Column(name = "promotion_info")
    private String promotionInfo;

}
