package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.VerifyStatus;

public class VerifyStatusDto  extends AbstractProductDto {
private String verifyStatus;
@Override
public void  execute(Product product){
product.setVerifyStatus(ValueObjectFactoty.newInstance(VerifyStatus.class,verifyStatus));
}
}
