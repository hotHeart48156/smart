package org.users.domainevent.aggevent;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class TagEvent {
    private org.users.dto.entity.TagDto TagDto;
}
