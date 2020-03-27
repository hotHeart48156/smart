package org.order.domain.repository;

import org.order.domain.entity.OrderItem;
import org.order.domain.vaueobject.id.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemId>{

}