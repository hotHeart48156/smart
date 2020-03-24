package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.product.dto.entity.ProductOperateLogDto;

@Value
@AllArgsConstructor
public class ProductOperateLogEvent {
    private org.product.dto.entity.ProductOperateLogDto ProductOperateLogDto;
}
