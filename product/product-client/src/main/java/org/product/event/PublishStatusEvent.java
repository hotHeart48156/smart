package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.PublishStatusDto;

@Value
@AllArgsConstructor
public class PublishStatusEvent {
    private org.product.dto.aggre.product.PublishStatusDto PublishStatusDto;
}
