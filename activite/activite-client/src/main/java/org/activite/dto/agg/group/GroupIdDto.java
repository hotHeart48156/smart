package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.GroupId;

@Data
public class  GroupIdDto  extends AbstractGroupDto{
private String groupId;
public void accept(Group group){
group.setGroupId(ValueObjectFactory.newInstance(GroupId.class ,this.groupId));
}
}
