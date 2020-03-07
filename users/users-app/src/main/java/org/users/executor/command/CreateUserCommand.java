package org.users.executor.command;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.CreateUserDto;
import org.users.executor.AbstractCommand;

/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class CreateUserCommand extends AbstractCommand {
    CreateUserDto createUserDto;

}
