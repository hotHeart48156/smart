package org.order.domain.repository;

import org.order.domain.entity.OrderReturnApply;
import org.order.domain.vaueobject.id.OrderReturnApplyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderReturnApplyRepository extends JpaRepository<OrderReturnApply,OrderReturnApplyId>{

}