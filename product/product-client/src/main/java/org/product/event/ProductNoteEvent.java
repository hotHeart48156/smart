package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductNoteEvent {
    private org.product.dto.aggre.product.ProductNoteDto ProductNoteDto;
}
