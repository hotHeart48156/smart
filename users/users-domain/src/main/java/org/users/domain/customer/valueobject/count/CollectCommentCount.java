package org.users.domain.customer.valueobject.count;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class CollectCommentCount extends AbstractCount {
    private Long count;
}
