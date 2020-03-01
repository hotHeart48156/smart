package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.user.Job;
import org.users.dto.JobDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateJobCommand {
    JobDto jobDto;

}
