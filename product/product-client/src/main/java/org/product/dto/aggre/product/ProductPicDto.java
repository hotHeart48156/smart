package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductPic;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductPicDto  extends AbstractProductDto {
private String productPic;
@Override
public void  execute(Product product){
product.setProductPic(ValueObjectFactoty.newInstance(ProductPic.class,productPic));
}
}
