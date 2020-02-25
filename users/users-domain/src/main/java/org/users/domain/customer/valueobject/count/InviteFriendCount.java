package org.users.domain.customer.valueobject.count;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class InviteFriendCount extends AbstractCount {
    private Long count;
}
