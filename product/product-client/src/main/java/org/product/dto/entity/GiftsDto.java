package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.Gifts;

@Data
public class GiftsDto {
    private String id;

    public void accept(Gifts gifts) {

    }
}
