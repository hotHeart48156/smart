package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.JobDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdateJobEvent extends AbstractEvent {
    JobDto jobDto;
}
