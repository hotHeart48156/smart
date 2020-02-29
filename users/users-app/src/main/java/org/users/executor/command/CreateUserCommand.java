package org.users.executor.command;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.executor.AbstractCommand;

/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CreateUserCommand extends AbstractCommand {
    CreateUserDto createUserDto;

    CreateUserCommand(CreateUserDto createUserDto) {
        this.createUserDto = createUserDto;
    }
}
