package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftsEvent {
    private org.product.dto.entity.GiftsDto GiftsDto;
}
