package org.users.domain.valueobject;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Embeddable
public class CreateTime implements ValueObject {
    @Column(name ="   createTime")
private Date createTime;
}
