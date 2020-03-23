package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductLogo;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductLogoDto  extends AbstractProductDto {
private String productLogo;
@Override
public void  execute(Product product){
product.setProductLogo(ValueObjectFactoty.newInstance(ProductLogo.class,productLogo));
}
}
