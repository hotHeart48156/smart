package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.price.GroupPrice;

@Data
public class  GroupPriceDto  extends AbstractGroupDto{
private String groupPrice;
public void accept(Group group){
group.setGroupPrice(ValueObjectFactory.newInstance(GroupPrice.class ,this.groupPrice));
}
}
