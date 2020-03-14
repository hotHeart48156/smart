package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PreviewStatusEvent {
    private PreviewStatusDto PreviewStatusDto;
}
