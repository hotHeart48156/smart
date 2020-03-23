package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.time.ProductPromotionPerLimit;

public class ProductPromotionPerLimitDto  extends AbstractProductDto {
private String productPromotionPerLimit;
@Override
public void  execute(Product product){
product.setProductPromotionPerLimit(ValueObjectFactoty.newInstance(ProductPromotionPerLimit.class,productPromotionPerLimit));
}
}
