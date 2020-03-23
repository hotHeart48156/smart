package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.count.ProductCount;

public class ProductCountDto  extends AbstractProductDto {
private String productCount;
@Override
public void  execute(Product product){
product.setProductCount(ValueObjectFactoty.newInstance(ProductCount.class,productCount));
}
}
