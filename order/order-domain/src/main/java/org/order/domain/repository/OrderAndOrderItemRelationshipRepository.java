package org.order.domain.repository;

import org.order.domain.entity.relationship.OrderAndOrderItemRelationship;
import org.order.domain.vaueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderAndOrderItemRelationshipRepository extends JpaRepository<OrderAndOrderItemRelationship, Id> {
}
