package org.product.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProductVerifyRecordEvent {
    private org.product.dto.entity.ProductVerifyRecordDto ProductVerifyRecordDto;
}
