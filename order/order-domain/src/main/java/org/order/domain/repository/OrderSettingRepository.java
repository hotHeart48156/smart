package org.order.domain.repository;

import org.order.domain.entity.OrderSetting;
import org.order.domain.vaueobject.id.OrderSettingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderSettingRepository extends JpaRepository<OrderSetting,OrderSettingId>{

}