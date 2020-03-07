package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.dto.GrowthDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdateGrowthEvent extends AbstractEvent {
    GrowthDto growthDto;
}
