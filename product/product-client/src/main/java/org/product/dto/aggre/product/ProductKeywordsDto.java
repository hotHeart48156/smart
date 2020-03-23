package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductKeywords;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductKeywordsDto  extends AbstractProductDto {
private String productKeywords;
@Override
public void  execute(Product product){
product.setProductKeywords(ValueObjectFactoty.newInstance(ProductKeywords.class,productKeywords));
}
}
