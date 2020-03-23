package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.name.ProductCategoryName;

public class ProductCategoryNameDto  extends AbstractProductDto {
private String productCategoryName;
@Override
public void  execute(Product product){
product.setProductCategoryName(ValueObjectFactoty.newInstance(ProductCategoryName.class,productCategoryName));
}
}
