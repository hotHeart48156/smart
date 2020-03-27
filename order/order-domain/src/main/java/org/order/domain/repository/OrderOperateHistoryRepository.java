package org.order.domain.repository;

import org.order.domain.entity.OrderOperateHistory;
import org.order.domain.vaueobject.id.OrderOperateHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderOperateHistoryRepository extends JpaRepository<OrderOperateHistory, OrderOperateHistoryId>{

}