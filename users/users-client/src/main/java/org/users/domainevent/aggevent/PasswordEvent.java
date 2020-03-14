package org.users.domainevent.aggevent;

import lombok.Value;

@Value
@AllArgsConstructor
public class PasswordEvent {
    private PasswordDto PasswordDto;
}
