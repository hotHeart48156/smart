package org.activite.domain.valueobject.user;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.domain.valueobject.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class UserLevel implements ValueObject {
    @Column(name ="level")
    private String level;
}
