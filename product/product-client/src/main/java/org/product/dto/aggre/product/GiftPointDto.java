package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.GiftPoint;
import org.product.domain.valueobject.ValueObjectFactoty;

public class GiftPointDto  extends AbstractProductDto {
private String giftPoint;
@Override
public void  execute(Product product){
product.setGiftPoint(ValueObjectFactoty.newInstance(GiftPoint.class,giftPoint));
}
}
