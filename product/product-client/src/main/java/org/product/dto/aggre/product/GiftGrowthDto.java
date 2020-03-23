package org.product.dto.aggre.product;
public class GiftGrowthDto  extends AbstractProductDto {
private String giftGrowth;
@Override
public void  execute(Product product){
product.setGiftGrowth(ValueObjectFactoty.newInstance(GiftGrowth.class,giftGrowth));
}
}
