package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.PublishStatus;

public class PublishStatusDto  extends AbstractProductDto {
private String publishStatus;
@Override
public void  execute(Product product){
product.setPublishStatus(ValueObjectFactoty.newInstance(PublishStatus.class,publishStatus));
}
}
