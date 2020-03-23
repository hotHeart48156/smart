package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.name.ProductName;

public class ProductNameDto  extends AbstractProductDto {
private String productName;
@Override
public void  execute(Product product){
product.setProductName(ValueObjectFactoty.newInstance(ProductName.class,productName));
}
}
