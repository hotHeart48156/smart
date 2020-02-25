package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.ContinueSignPoint;
import org.users.domain.customer.valueobject.count.ContinueSignDayCount;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public class UserIntegrationRule implements Entity {
    private Id id;
    private UserId userId;
    private ContinueSignDayCount continueSignDayCount;
    private ContinueSignPoint continueSignPoint;

}
