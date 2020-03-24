package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.RecommandStatusDto;

@Value
@AllArgsConstructor
public class RecommandStatusEvent {
    private org.product.dto.aggre.product.RecommandStatusDto RecommandStatusDto;
}
