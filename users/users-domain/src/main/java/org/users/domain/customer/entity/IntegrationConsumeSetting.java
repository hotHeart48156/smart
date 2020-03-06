package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.DeductionPerAmount;
import org.users.domain.customer.valueobject.MaxPointPerOrder;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class IntegrationConsumeSetting implements Entity {
    @EmbeddedId
private  Id id;
    @Embedded
private  DeductionPerAmount deductionPerAmount;
    @Embedded
private  MaxPointPerOrder maxPointPerOrder;
}
