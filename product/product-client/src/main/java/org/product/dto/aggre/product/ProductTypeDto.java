package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.type.ProductType;

public class ProductTypeDto  extends AbstractProductDto {
private String productType;
@Override
public void  execute(Product product){
product.setProductType(ValueObjectFactoty.newInstance(ProductType.class,productType));
}
}
