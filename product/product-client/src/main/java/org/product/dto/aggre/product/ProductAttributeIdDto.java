package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.id.ProductAttributeId;

public class ProductAttributeIdDto  extends AbstractProductDto {
private String productAttributeId;
@Override
public void  execute(Product product){
product.setProductAttributeId(ValueObjectFactoty.newInstance(ProductAttributeId.class,productAttributeId));
}
}
