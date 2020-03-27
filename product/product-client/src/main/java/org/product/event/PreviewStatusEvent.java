package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PreviewStatusEvent {
    private org.product.dto.aggre.product.PreviewStatusDto PreviewStatusDto;
}
