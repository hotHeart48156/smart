package org.product.dto.aggre.product;
public class NewStatusDto  extends AbstractProductDto {
private String newStatus;
@Override
public void  execute(Product product){
product.setNewStatus(ValueObjectFactoty.newInstance(NewStatus.class,newStatus));
}
}
