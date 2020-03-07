package org.users.dto.domainevent;


import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.aggregation.CreateUserDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class CreateUserEvent extends AbstractEvent {
    private CreateUserDto createUserDto;

    public CreateUserEvent(CreateUserDto userDto) {
        this.createUserDto = userDto;
    }
}
