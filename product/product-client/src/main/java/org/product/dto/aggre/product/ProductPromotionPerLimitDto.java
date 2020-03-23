package org.product.dto.aggre.product;
public class ProductPromotionPerLimitDto  extends AbstractProductDto {
private String productPromotionPerLimit;
@Override
public void  execute(Product product){
product.setProductPromotionPerLimit(ValueObjectFactoty.newInstance(ProductPromotionPerLimit.class,productPromotionPerLimit));
}
}
