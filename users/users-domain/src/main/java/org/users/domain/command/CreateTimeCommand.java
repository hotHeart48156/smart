package org.users.domain.command;

import lombok.Value;

@Value
public class CreateTimeCommand {
    private org.users.domain.dto.agg.CreateTimeDto CreateTimeDto;
}
