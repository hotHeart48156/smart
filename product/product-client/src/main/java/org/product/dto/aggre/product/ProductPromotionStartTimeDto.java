package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.time.ProductPromotionStartTime;

public class ProductPromotionStartTimeDto  extends AbstractProductDto {
private String productPromotionStartTime;
@Override
public void  execute(Product product){
product.setProductPromotionStartTime(ValueObjectFactoty.newInstance(ProductPromotionStartTime.class,productPromotionStartTime));
}
}
