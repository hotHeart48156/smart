package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.TitleDto;

@Value
@AllArgsConstructor
public class TitleEvent {
    private org.product.dto.aggre.product.TitleDto TitleDto;
}
