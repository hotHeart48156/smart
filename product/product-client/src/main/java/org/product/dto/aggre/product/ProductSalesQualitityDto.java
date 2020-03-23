package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductSalesQualitity;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductSalesQualitityDto  extends AbstractProductDto {
private String productSalesQualitity;
@Override
public void  execute(Product product){
product.setProductSalesQualitity(ValueObjectFactoty.newInstance(ProductSalesQualitity.class,productSalesQualitity));
}
}
