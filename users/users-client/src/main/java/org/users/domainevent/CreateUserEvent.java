package org.users.domainevent;


import lombok.EqualsAndHashCode;
import lombok.Value;

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
