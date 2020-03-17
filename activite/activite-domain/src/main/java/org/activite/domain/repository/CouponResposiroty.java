package org.activite.domain.repository;

import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.id.CouponId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponResposiroty extends JpaRepository<Coupon, CouponId> {
}
