package org.product.dto.aggregationDto.aggre;

@Value
public class ProductNoteDto {
    private String UserId;
    private String productNote;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductNote(ValueObjectFactory.newInstance(ProductNote.class, this.productNote));
    }
}
