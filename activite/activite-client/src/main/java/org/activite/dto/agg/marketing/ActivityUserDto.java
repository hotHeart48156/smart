package org.activite.dto.agg.marketing;

import lombok.Data;
import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.ActivityUser;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  ActivityUserDto  extends AbstractMarketingDto{
private String activityUser;
public void accept(Marketing marketing){
marketing.setActivityUser(ValueObjectFactory.newInstance(ActivityUser.class ,this.activityUser));
}
}
