package org.product.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class UserIdEvent {
    private UserIdDto UserIdDto;
}
