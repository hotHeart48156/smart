package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.ShowStatus;

public class ShowStatusDto  extends AbstractProductDto {
private String showStatus;
@Override
public void  execute(Product product){
product.setShowStatus(ValueObjectFactoty.newInstance(ShowStatus.class,showStatus));
}
}
