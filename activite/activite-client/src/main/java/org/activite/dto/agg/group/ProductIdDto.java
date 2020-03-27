package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.ProductId;

@Data
public class  ProductIdDto  extends AbstractGroupDto{
private String productId;
public void accept(Group group){
group.setProductId(ValueObjectFactory.newInstance(ProductId.class ,this.productId));
}
}
