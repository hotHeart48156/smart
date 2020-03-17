package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class PasswordEvent {
    private org.users.dto.agg.PasswordDto PasswordDto;
}
