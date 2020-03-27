package org.order.domain.repository;

import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.id.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangbiao
 */
@org.springframework.stereotype.Repository
public interface OrderRepository extends Repository, JpaRepository<Order, OrderId> {
}
