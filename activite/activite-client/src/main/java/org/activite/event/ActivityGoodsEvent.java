package org.activite.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ActivityGoodsEvent   extends AbstractEvent  {
    private org.activite.dto.agg.ActivityGoodsDto ActivityGoodsDto;
}
