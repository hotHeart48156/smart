package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GiftEvent   extends AbstractEvent   {
    private org.activite.dto.entity.GiftDto GiftDto;
}
