package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class HomeNewProductEvent   extends AbstractEvent   {
    private org.activite.dto.entity.HomeNewProductDto HomeNewProductDto;
}
