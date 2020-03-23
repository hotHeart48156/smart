package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.type.PromotionType;

public class PromotionTypeDto  extends AbstractProductDto {
private String promotionType;
@Override
public void  execute(Product product){
product.setPromotionType(ValueObjectFactoty.newInstance(PromotionType.class,promotionType));
}
}
