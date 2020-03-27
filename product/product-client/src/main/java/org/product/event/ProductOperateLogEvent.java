package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductOperateLogEvent {
    private org.product.dto.entity.ProductOperateLogDto ProductOperateLogDto;
}
