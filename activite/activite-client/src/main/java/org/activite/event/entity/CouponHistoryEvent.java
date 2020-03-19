package org.activite.event.entity;

import lombok.Value;
import org.activite.dto.entity.CouponHistoryDto;
import org.activite.event.AbstractEvent;
@Value
public class CouponHistoryEvent  extends AbstractEvent
{
    CouponHistoryDto couponHistoryDto;
}