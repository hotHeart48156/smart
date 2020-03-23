package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.id.FeightTemplateId;
import org.product.dto.aggre.product.AbstractProductDto;

public class FeightTemplateIdDto  extends AbstractProductDto {
private String feightTemplateId;
@Override
public void  execute(Product product){
product.setFeightTemplateId(ValueObjectFactoty.newInstance(FeightTemplateId.class,feightTemplateId));
}
}
