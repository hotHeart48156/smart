package org.order.domain.repository;

import org.order.domain.entity.OrderReturnReason;
import org.order.domain.vaueobject.id.OrderReturnReasonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderReturnReasonRepository extends JpaRepository<OrderReturnReason,OrderReturnReasonId>{

}