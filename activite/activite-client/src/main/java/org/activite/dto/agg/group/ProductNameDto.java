package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.name.ProductName;

@Data
public class  ProductNameDto  extends AbstractGroupDto{
private String productName;
public void accept(Group group){
group.setProductName(ValueObjectFactory.newInstance(ProductName.class ,this.productName));
}
}
