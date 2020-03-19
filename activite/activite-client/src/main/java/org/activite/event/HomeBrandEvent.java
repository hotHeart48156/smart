package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class HomeBrandEvent   extends AbstractEvent   {
    private org.activite.dto.entity.HomeBrandDto HomeBrandDto;
}
