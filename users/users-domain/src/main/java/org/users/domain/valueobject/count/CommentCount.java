package org.users.domain.valueobject.count;

import lombok.AllArgsConstructor;
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

@AllArgsConstructor
public class CommentCount extends AbstractCount {

@Column(name ="   commentCount")
@Column(name ="   commentCount")
private Long count;

}
