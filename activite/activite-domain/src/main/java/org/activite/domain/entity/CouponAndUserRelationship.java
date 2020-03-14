package org.activite.domain.entity;

import org.activite.domain.valueobject.id.AbstractId;
import org.activite.domain.valueobject.id.CouponId;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.UserId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
public class CouponAndUserRelationship extends AbstractId {
     @EmbeddedId
private Id id;
     @Embedded
private CouponId couponId;
     @Embedded
private UserId userId;

}
