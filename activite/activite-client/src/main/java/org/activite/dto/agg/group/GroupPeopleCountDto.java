package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.GroupPeopleCount;

@Data
public class  GroupPeopleCountDto  extends AbstractGroupDto{
private String groupPeopleCount;
public void accept(Group group){
group.setGroupPeopleCount(ValueObjectFactory.newInstance(GroupPeopleCount.class ,this.groupPeopleCount));
}
}
