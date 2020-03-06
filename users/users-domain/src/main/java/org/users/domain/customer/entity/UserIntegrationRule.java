package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.ContinueSignPoint;
import org.users.domain.customer.valueobject.count.ContinueSignDayCount;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class UserIntegrationRule implements Entity {
    @EmbeddedId
private  Id id;
    @Embedded
private  UserId userId;
    @Embedded
private  ContinueSignDayCount continueSignDayCount;
    @Embedded
private  ContinueSignPoint continueSignPoint;

}
