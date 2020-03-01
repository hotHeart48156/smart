package org.users.executor.command;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.executor.AbstractCommand;

/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class CreateUserCommand extends AbstractCommand {
    CreateUserDto createUserDto;

    public CreateUserCommand(CreateUserDto createUserDto) {
        this.createUserDto = createUserDto;
    }
}
