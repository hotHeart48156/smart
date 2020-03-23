package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.RecommandStatus;

public class RecommandStatusDto  extends AbstractProductDto {
private String recommandStatus;
@Override
public void  execute(Product product){
product.setRecommandStatus(ValueObjectFactoty.newInstance(RecommandStatus.class,recommandStatus));
}
}
