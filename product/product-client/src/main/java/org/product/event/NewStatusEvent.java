package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class NewStatusEvent {
    private NewStatusDto NewStatusDto;
}
