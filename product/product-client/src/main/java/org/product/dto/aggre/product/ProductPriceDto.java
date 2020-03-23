package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.price.ProductPrice;

public class ProductPriceDto  extends AbstractProductDto {
private String productPrice;
@Override
public void  execute(Product product){
product.setProductPrice(ValueObjectFactoty.newInstance(ProductPrice.class,productPrice));
}
}
