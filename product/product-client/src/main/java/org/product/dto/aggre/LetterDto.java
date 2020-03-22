package org.product.dto.aggre;

@Data
public class LetterDto {
    private String ProductId;
    private String firstLetter;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setLetter(ValueObjectFactory.newInstance(Letter.class, this.firstLetter));
    }
}
