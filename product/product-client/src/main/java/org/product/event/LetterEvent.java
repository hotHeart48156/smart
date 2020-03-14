package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class LetterEvent {
    private LetterDto LetterDto;
}
