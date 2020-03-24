package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.PreviewStatusDto;

@Value
@AllArgsConstructor
public class PreviewStatusEvent {
    private org.product.dto.aggre.product.PreviewStatusDto PreviewStatusDto;
}
