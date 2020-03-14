package org.activite.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ActivityGoodsEvent {
    private ActivityGoodsDto ActivityGoodsDto;
}
