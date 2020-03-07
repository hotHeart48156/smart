package org.users.domain.valueobject;

import javax.persistence.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Entity
@Embeddable
public class OperateMan implements ValueObject {
    @Column(name ="   operateMan")
private   String name;
}
