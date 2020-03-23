package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.NewStatus;

public class NewStatusDto  extends AbstractProductDto {
private String newStatus;
@Override
public void  execute(Product product){
product.setNewStatus(ValueObjectFactoty.newInstance(NewStatus.class,newStatus));
}
}
