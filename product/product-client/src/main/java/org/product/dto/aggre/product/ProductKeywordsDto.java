package org.product.dto.aggre.product;
public class ProductKeywordsDto  extends AbstractProductDto {
private String productKeywords;
@Override
public void  execute(Product product){
product.setProductKeywords(ValueObjectFactoty.newInstance(ProductKeywords.class,productKeywords));
}
}
