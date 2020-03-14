package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductVerifyRecordEvent {
    private ProductVerifyRecordDto ProductVerifyRecordDto;
}
