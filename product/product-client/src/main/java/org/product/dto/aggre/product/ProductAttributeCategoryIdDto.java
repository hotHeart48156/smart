package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;

public class ProductAttributeCategoryIdDto  extends AbstractProductDto {
private String productAttributeCategoryId;
@Override
public void  execute(Product product){
product.setProductAttributeCategoryId(ValueObjectFactoty.newInstance(ProductAttributeCategoryId.class,productAttributeCategoryId));
}
}
