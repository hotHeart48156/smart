package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.id.ProductCategoryId;

public class ProductCategoryIdDto  extends AbstractProductDto {
private String productCategoryId;
@Override
public void  execute(Product product){
product.setProductCategoryId(ValueObjectFactoty.newInstance(ProductCategoryId.class,productCategoryId));
}
}
