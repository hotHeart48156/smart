package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.GrowthDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateGrowthCommand {
    GrowthDto growthDto;

}
