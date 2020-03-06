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
public class ArticleCount extends AbstractCount {
@Column(name ="   articleCount")
private Long articleCount;
}
