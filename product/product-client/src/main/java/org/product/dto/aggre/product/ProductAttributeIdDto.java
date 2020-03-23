package org.product.dto.aggre.product;
public class ProductAttributeIdDto  extends AbstractProductDto {
private String productAttributeId;
@Override
public void  execute(Product product){
product.setProductAttributeId(ValueObjectFactoty.newInstance(ProductAttributeId.class,productAttributeId));
}
}
