package org.users.domain.valueobject.user;

import lombok.Value;
import org.users.domain.valueobject.ValueObject;

import javax.persistence.Embeddable;
import java.sql.Timestamp;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class Birthday implements ValueObject {
    @Column(name ="   birthday")
private Timestamp birthday;
}
