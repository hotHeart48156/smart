package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.price.ProductPromotionPrice;

public class ProductPromotionPriceDto  extends AbstractProductDto {
private String productPromotionPrice;
@Override
public void  execute(Product product){
product.setPromotionPrice(ValueObjectFactoty.newInstance(ProductPromotionPrice.class,productPromotionPrice));
}
}
