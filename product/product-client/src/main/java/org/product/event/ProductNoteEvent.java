package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductNoteEvent {
    private ProductNoteDto ProductNoteDto;
}
