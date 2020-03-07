package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class OperateNote implements ValueObject {
    @Column(name ="   operateNote")
private     String note;
}
