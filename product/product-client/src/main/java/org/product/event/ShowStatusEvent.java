package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ShowStatusEvent {
    private org.product.dto.aggre.product.ShowStatusDto ShowStatusDto;
}
