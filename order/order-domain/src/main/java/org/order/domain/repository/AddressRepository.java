package org.order.domain.repository;

import org.order.domain.entity.Address;
import org.order.domain.vaueobject.id.AddressId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, AddressId> {

}