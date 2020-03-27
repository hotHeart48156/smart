package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecommandStatusEvent {
    private org.product.dto.aggre.product.RecommandStatusDto RecommandStatusDto;
}
