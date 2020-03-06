package org.activite.domain.activite.repository;

import org.activite.domain.activite.entity.CouponHistory;
import org.activite.domain.activite.valueobject.id.CouponId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponHistoryRepository extends JpaRepository<CouponHistory, CouponId> {}