package org.users.domain.valueobject;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
public class CommentGrowthPoint implements ValueObject {
    @Column(name ="   commentGrowthPoint")
private  String point;
}
