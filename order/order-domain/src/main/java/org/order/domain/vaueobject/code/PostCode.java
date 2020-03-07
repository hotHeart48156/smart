package org.order.domain.vaueobject.code;

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
public class PostCode extends AbstractCode {
    @Column(name = "postCode")
    private String postCode;

}
