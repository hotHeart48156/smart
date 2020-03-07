package org.activite.domain.repository;

import org.activite.domain.entity.CouponHistory;
import org.activite.domain.valueobject.id.CouponId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponHistoryRepository extends JpaRepository<CouponHistory, CouponId> {}