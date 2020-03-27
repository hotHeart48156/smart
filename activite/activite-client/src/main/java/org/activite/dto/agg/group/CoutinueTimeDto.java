package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.CoutinueTime;

@Data
public class  CoutinueTimeDto  extends AbstractGroupDto{
private String coutinueTime;
public void accept(Group group){
group.setCoutinueTime(ValueObjectFactory.newInstance(CoutinueTime.class ,this.coutinueTime));
}
}
