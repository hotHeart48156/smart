package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.GiftsDto;

@Value
@AllArgsConstructor
public class GiftsEvent {
    private org.product.dto.entity.GiftsDto GiftsDto;
}
