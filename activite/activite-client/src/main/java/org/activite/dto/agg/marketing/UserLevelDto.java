package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.user.UserLevel;

@Data
public class  UserLevelDto  extends AbstractMarketingDto{
private String userLevel;
public void accept(Marketing marketing){
marketing.setUserLevel(ValueObjectFactory.newInstance(UserLevel.class ,this.userLevel));
}
}
