package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductOriginalPrice;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductOriginalPriceDto  extends AbstractProductDto {
private String productOriginalPrice;
@Override
public void  execute(Product product){
product.setOriginalPrice(ValueObjectFactoty.newInstance(ProductOriginalPrice.class,productOriginalPrice));
}
}
