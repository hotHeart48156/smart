package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.ShowStatusDto;

@Value
@AllArgsConstructor
public class ShowStatusEvent {
    private org.product.dto.aggre.product.ShowStatusDto ShowStatusDto;
}
