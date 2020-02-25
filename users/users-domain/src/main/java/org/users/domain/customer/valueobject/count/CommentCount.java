package org.users.domain.customer.valueobject.count;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class CommentCount extends AbstractCount {
    private Long count;

}
