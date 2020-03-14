package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class PasswordEvent {
    private PasswordDto PasswordDto;
}
