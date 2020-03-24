package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.NewStatusDto;

@Value
@AllArgsConstructor
public class NewStatusEvent {
    private org.product.dto.aggre.product.NewStatusDto NewStatusDto;
}
