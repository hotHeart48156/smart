package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class TitleEvent {
    private TitleDto TitleDto;
}