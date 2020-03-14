package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductOperateLogEvent {
    private ProductOperateLogDto ProductOperateLogDto;
}
