package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.checkerframework.checker.units.qual.A;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.id.UserId;
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
