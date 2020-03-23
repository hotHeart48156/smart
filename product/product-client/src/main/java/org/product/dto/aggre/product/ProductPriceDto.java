package org.product.dto.aggre.product;
public class ProductPriceDto  extends AbstractProductDto {
private String productPrice;
@Override
public void  execute(Product product){
product.setProductPrice(ValueObjectFactoty.newInstance(ProductPrice.class,productPrice));
}
}
