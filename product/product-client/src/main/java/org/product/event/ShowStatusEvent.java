package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ShowStatusEvent {
    private ShowStatusDto ShowStatusDto;
}
