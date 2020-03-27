package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class LetterEvent {
    private org.product.dto.aggre.brand.LetterDto LetterDto;
}
