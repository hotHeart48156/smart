package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.Title;
import org.product.domain.valueobject.ValueObjectFactoty;

public class TitleDto  extends AbstractProductDto {
private String title;
@Override
public void  execute(Product product){
product.setTitle(ValueObjectFactoty.newInstance(Title.class,title));
}
}
