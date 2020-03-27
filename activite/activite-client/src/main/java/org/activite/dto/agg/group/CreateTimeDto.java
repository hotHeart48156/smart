package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.CreateTime;

@Data
public class  CreateTimeDto  extends AbstractGroupDto{
private String createTime;
public void accept(Group group){
group.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class ,this.createTime));
}
}
