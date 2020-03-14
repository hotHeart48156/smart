package org.product.dtoo.aggdto;

@Data
public class ProductNoteDto {
    private String ProductId;
    private String productNote;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductNote(ValueObjectFactory.newInstance(ProductNote.class, this.productNote));
    }
}
