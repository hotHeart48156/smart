package org.users.dto.domainevent;


import org.users.domain.customer.aggregation.CreateUserDto;

/**
 * @author "yangbiao"
 */
public class CreateUserEvent extends AbstractEvent {
    private CreateUserDto createUserDto;

    public CreateUserEvent(CreateUserDto userDto) {
        this.createUserDto = userDto;
    }
}
