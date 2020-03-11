package org.product.domain.valueobject;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author yangbiao
 */
@Embeddable
@Value
public class Title implements ValueObject {
    @Column(name = "title")
    private String title;
}
