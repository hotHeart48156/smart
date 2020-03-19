package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class HomeAdvertiseEvent   extends AbstractEvent   {
    private org.activite.dto.entity.HomeAdvertiseDto HomeAdvertiseDto;
}
