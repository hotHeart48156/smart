package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactoty;
import org.product.domain.valueobject.status.PreviewStatus;

public class PreviewStatusDto  extends AbstractProductDto {
private String previewStatus;
@Override
public void  execute(Product product){
product.setPreviewStatus(ValueObjectFactoty.newInstance(PreviewStatus.class,previewStatus));
}
}
