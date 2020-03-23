package org.product.dto.aggre.product;
public class ProductNameDto  extends AbstractProductDto {
private String productName;
@Override
public void  execute(Product product){
product.setProductName(ValueObjectFactoty.newInstance(ProductName.class,productName));
}
}
