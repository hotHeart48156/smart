package org.users.domain.entity;

import lombok.Data;
import org.users.domain.valueobject.ContinueSignPoint;
import org.users.domain.valueobject.count.ContinueSignDayCount;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class UserIntegrationRule implements Entity {
    @EmbeddedId
private Id id;
    @Embedded
private UserId userId;
    @Embedded
private ContinueSignDayCount continueSignDayCount;
    @Embedded
private ContinueSignPoint continueSignPoint;

}
