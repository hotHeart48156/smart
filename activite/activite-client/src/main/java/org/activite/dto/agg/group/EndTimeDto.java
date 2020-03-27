package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.EndTime;

@Data
public class  EndTimeDto  extends AbstractGroupDto{
private String endTime;
public void accept(Group group){
group.setEndTime(ValueObjectFactory.newInstance(EndTime.class ,this.endTime));
}
}
