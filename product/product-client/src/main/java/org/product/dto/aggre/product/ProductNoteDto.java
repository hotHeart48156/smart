package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductNote;
import org.product.domain.valueobject.ValueObjectFactoty;

public class ProductNoteDto  extends AbstractProductDto {
private String productNote;
@Override
public void  execute(Product product){
product.setProductNote(ValueObjectFactoty.newInstance(ProductNote.class,productNote));
}
}
