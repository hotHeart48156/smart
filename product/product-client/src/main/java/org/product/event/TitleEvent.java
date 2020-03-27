package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class TitleEvent {
    private org.product.dto.aggre.product.TitleDto TitleDto;
}
