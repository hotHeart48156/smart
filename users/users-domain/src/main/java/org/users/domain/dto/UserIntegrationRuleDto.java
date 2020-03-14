package org.users.domain.dto.entity;

import lombok.Data;
import org.users.domain.entity.UserIntegrationRule;
import org.users.domain.valueobject.ContinueSignPoint;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.count.ContinueSignDayCount;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

@Data
public class UserIntegrationRuleDto {
    private String id;
    private String userId;
    private String continueSignDayCount;
    private String continueSignPoint;

    public void accept(UserIntegrationRule userintegrationrule) {
        userintegrationrule.setId(ValueObjectFactory.newInstance(Id.class, id));
        userintegrationrule.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        userintegrationrule.setContinueSignDayCount(ValueObjectFactory.newInstance(ContinueSignDayCount.class, continueSignDayCount));
        userintegrationrule.setContinueSignPoint(ValueObjectFactory.newInstance(ContinueSignPoint.class, continueSignPoint));
    }
}
