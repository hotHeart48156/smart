package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class HomeNewProductEvent {
    private HomeNewProductDto HomeNewProductDto;
}
