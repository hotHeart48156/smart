package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductDescription;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductDescriptionDto  extends AbstractProductDto {
private String productDescription;
@Override
public void  execute(Product product){
product.setProductDescription(ValueObjectFactoty.newInstance(ProductDescription.class,productDescription));
}
}
