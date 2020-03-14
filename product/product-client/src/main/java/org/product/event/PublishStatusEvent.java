package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PublishStatusEvent {
    private PublishStatusDto PublishStatusDto;
}
