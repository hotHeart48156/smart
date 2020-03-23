package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.sn.ProductSn;

public class ProductSnDto  extends AbstractProductDto {
private String productSn;
@Override
public void  execute(Product product){
product.setProductSn(ValueObjectFactoty.newInstance(ProductSn.class,productSn));
}
}
