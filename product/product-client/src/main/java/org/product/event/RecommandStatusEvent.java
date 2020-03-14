package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class RecommandStatusEvent {
    private RecommandStatusDto RecommandStatusDto;
}
