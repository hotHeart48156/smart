package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class ProductCommentEvent {
    private ProductCommentDto ProductCommentDto;
}
