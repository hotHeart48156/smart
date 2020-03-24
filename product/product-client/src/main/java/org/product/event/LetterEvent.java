package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.aggre.brand.LetterDto;

@Value
@AllArgsConstructor
public class LetterEvent {
    private org.product.dto.aggre.brand.LetterDto LetterDto;
}
