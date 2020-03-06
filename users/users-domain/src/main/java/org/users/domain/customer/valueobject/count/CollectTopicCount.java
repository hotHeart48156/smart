package org.users.domain.customer.valueobject.count;

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

public class CollectTopicCount extends AbstractCount {

@Column(name ="   collectTopicCount")
@Column(name ="   collectTopicCount")
private Long count;
}
