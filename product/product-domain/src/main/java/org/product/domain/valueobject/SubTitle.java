package org.product.domain.valueobject;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author yangbiao
 */
@Embeddable
@Value
public class SubTitle implements ValueObject {
    @Column(name ="subtitle")
    private String subtitle;
}
