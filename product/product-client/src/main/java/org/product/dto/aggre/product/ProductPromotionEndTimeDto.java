package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.time.ProductPromotionEndTime;

public class ProductPromotionEndTimeDto  extends AbstractProductDto {
private String productPromotionEndTime;
@Override
public void  execute(Product product){
product.setProductPromotionEndTime(ValueObjectFactoty.newInstance(ProductPromotionEndTime.class,productPromotionEndTime));
}
}
