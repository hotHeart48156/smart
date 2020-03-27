package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.GroupPeopleMaxCount;

@Data
public class  GroupPeopleMaxCountDto  extends AbstractGroupDto{
private String groupPeopleMaxCount;
public void accept(Group group){
group.setGroupPeopleMaxCount(ValueObjectFactory.newInstance(GroupPeopleMaxCount.class ,this.groupPeopleMaxCount));
}
}
