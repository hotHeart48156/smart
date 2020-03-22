package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.Letter;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class LetterDto {
    private String ProductId;
    private String firstLetter;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        brand.setLetter(ValueObjectFactory.newInstance(Letter.class, this.firstLetter));
    }
}
