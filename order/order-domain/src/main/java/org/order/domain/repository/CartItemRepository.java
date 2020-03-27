package org.order.domain.repository;

import org.order.domain.entity.CartItem;
import org.order.domain.vaueobject.id.CartItemId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem,CartItemId>{

}