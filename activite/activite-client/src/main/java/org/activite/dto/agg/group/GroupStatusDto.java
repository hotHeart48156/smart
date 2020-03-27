package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.status.GroupStatus;

@Data
public class  GroupStatusDto  extends AbstractGroupDto{
private String groupStatus;
public void accept(Group group){
group.setGroupStatus(ValueObjectFactory.newInstance(GroupStatus.class ,this.groupStatus));
}
}
