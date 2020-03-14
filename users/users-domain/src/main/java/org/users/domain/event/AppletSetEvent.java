package org.users.domain.event;

import lombok.Value;

@Value
@AllArgsConstructor
public class AppletSetEvent {
    private AppletSetDto AppletSetDto;
}
