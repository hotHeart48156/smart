package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductSubtitle;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductSubtitleDto  extends AbstractProductDto {
private String productSubtitle;
@Override
public void  execute(Product product){
product.setProductSubtitle(ValueObjectFactoty.newInstance(ProductSubtitle.class,productSubtitle));
}
}
