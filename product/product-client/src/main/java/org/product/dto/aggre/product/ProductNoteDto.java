package org.product.dto.aggre.product;
public class ProductNoteDto  extends AbstractProductDto {
private String productNote;
@Override
public void  execute(Product product){
product.setProductNote(ValueObjectFactoty.newInstance(ProductNote.class,productNote));
}
}
