package org.users.domain.valueobject.count;

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

public class CollectCommentCount extends AbstractCount {

@Column(name ="   collectCommentCount")
@Column(name ="   collectCommentCount")
private Long count;
}
