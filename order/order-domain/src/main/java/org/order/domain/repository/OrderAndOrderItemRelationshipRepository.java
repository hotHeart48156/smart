package org.order.domain.repository;

import org.order.domain.entity.relationship.OrderAndOrderItemRelationship;
import org.order.domain.vaueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderAndOrderItemRelationshipRepository extends JpaRepository<OrderAndOrderItemRelationship, Id>{

}