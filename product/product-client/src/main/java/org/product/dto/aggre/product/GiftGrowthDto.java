package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.GiftGrowth;
import org.product.domain.valueobject.ValueObjectFactoty;

public class GiftGrowthDto  extends AbstractProductDto {
private String giftGrowth;
@Override
public void  execute(Product product){
product.setGiftGrowth(ValueObjectFactoty.newInstance(GiftGrowth.class,giftGrowth));
}
}
