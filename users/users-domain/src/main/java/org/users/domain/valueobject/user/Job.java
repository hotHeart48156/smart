package org.users.domain.valueobject.user;

import lombok.Value;
import org.users.domain.valueobject.ValueObject;

import javax.persistence.Embeddable;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class Job implements ValueObject {
   @Column(name ="   job")
private String job;
}
