package org.product.dto.aggre.product;
public class ProductAttributeCategoryIdDto  extends AbstractProductDto {
private String productAttributeCategoryId;
@Override
public void  execute(Product product){
product.setProductAttributeCategoryId(ValueObjectFactoty.newInstance(ProductAttributeCategoryId.class,productAttributeCategoryId));
}
}
