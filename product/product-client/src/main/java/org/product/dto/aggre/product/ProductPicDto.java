package org.product.dto.aggre.product;
public class ProductPicDto  extends AbstractProductDto {
private String productPic;
@Override
public void  execute(Product product){
product.setProductPic(ValueObjectFactoty.newInstance(ProductPic.class,productPic));
}
}
