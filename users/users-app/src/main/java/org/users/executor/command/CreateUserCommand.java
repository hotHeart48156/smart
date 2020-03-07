package org.users.executor.command;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.aggregation.CreateUserDto;
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
