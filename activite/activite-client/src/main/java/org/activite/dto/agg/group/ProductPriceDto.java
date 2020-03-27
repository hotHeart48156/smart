package org.activite.dto.agg.group;

import lombok.Data;
import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.price.ProductPrice;

@Data
public class  ProductPriceDto  extends AbstractGroupDto{
private String productPrice;
public void accept(Group group){
group.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class ,this.productPrice));
}
}
