package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.product.DeleteStatusDto;

@Value
@AllArgsConstructor
public class DeleteStatusEvent {
    private org.product.dto.aggre.product.DeleteStatusDto DeleteStatusDto;
}
