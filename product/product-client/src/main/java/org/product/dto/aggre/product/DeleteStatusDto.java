package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.DeleteStatus;

public class DeleteStatusDto  extends AbstractProductDto {
private String deleteStatus;
@Override
public void  execute(Product product){
product.setDeleteStatus(ValueObjectFactoty.newInstance(DeleteStatus.class,deleteStatus));
}
}
