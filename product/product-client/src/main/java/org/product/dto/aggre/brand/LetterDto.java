package org.product.dto.aggre.brand;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.Letter;
import org.product.domain.valueobject.ValueObjectFactoty;

@Data
public class LetterDto extends AbstractBrandDto{
    private String firstLetter;


    @Override
    public void execute(Brand brand) {
        brand.setFirstLetter(ValueObjectFactoty.newInstance(Letter.class,firstLetter));
    }
}
