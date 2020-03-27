package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class NewStatusEvent {
    private org.product.dto.aggre.product.NewStatusDto NewStatusDto;
}
