package org.users.domain.entity;

import org.users.domain.valueobject.DeductionPerAmount;
import org.users.domain.valueobject.MaxPointPerOrder;
import org.users.domain.valueobject.id.Id;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class IntegrationConsumeSetting implements Entity {
    @EmbeddedId
private Id id;
    @Embedded
private DeductionPerAmount deductionPerAmount;
    @Embedded
private MaxPointPerOrder maxPointPerOrder;
}
