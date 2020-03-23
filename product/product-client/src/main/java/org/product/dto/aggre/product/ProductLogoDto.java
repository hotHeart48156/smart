package org.product.dto.aggre.product;
public class ProductLogoDto  extends AbstractProductDto {
private String productLogo;
@Override
public void  execute(Product product){
product.setProductLogo(ValueObjectFactoty.newInstance(ProductLogo.class,productLogo));
}
}
