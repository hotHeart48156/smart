package org.users.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.users.dto.IntegrationDto;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class UpdateIntegrationCommand {
    IntegrationDto integrationDto;
}
