package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.UsePointLimit;
import org.product.domain.valueobject.ValueObjectFactoty;

public class UsePointLimitDto  extends AbstractProductDto {
private String usePointLimit;
@Override
public void  execute(Product product){
product.setUsePointLimit(ValueObjectFactoty.newInstance(UsePointLimit.class,usePointLimit));
}
}
