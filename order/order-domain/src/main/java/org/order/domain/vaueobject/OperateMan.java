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
public class OperateMan implements ValueObject {
    @Column(name = "operate_man")
    private String operateMan;

}
