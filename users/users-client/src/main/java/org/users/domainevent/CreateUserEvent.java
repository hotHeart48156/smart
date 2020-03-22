package org.users.domainevent;


import lombok.Value;
import org.users.dto.entity.CreateUserDto;

/**
 * @author "yangbiao"
 */
@Value
public class CreateUserEvent  {
    private CreateUserDto createUserDto;

    public CreateUserEvent(CreateUserDto userDto) {
        super();
        this.createUserDto = userDto;
    }
}
