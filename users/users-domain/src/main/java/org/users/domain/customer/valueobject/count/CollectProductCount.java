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

public class CollectProductCount extends AbstractCount {

@Column(name ="   collectProductCount")
@Column(name ="   collectProductCount")
private Long count;
}
