package org.users.domain.customer.valueobject.count;

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
public class OrderCount extends AbstractCount {

@Column(name ="   orderCount")
@Column(name ="   orderCount")
private Long count;

}
