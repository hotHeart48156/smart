package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductStock;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductStockDto  extends AbstractProductDto {
private String productStock;
@Override
public void  execute(Product product){
product.setProductStock(ValueObjectFactoty.newInstance(ProductStock.class,productStock));
}
}
