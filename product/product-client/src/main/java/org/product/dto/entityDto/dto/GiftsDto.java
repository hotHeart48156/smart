package org.product.dto.entityDto.dto;

import lombok.Data;
import org.product.domain.entity.Gifts;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class GiftsDto {
    private String id;

    public void accept(Gifts gifts) {
        gifts.setId(ValueObjectFactory.newInstance(Id.class, id));
    }
}
