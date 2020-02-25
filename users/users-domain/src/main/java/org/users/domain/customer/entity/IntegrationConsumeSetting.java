package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.DeductionPerAmount;
import org.users.domain.customer.valueobject.MaxPointPerOrder;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public class IntegrationConsumeSetting implements Entity {
    private Id id;
    private DeductionPerAmount deductionPerAmount;
    private MaxPointPerOrder maxPointPerOrder;
}
