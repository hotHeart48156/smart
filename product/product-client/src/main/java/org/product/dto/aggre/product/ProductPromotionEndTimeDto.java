package org.product.dto.aggre.product;
public class ProductPromotionEndTimeDto  extends AbstractProductDto {
private String productPromotionEndTime;
@Override
public void  execute(Product product){
product.setProductPromotionEndTime(ValueObjectFactoty.newInstance(ProductPromotionEndTime.class,productPromotionEndTime));
}
}
