package org.product.dto.aggre.product;
public class ProductOriginalPriceDto  extends AbstractProductDto {
private String productOriginalPrice;
@Override
public void  execute(Product product){
product.setProductOriginalPrice(ValueObjectFactoty.newInstance(ProductOriginalPrice.class,productOriginalPrice));
}
}
