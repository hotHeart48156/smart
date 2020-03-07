package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.dto.NicknameDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateNicknameCommand {
    NicknameDto nicknameDto;

}
