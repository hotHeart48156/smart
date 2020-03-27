package org.product.domain.repository.entity;

import org.product.domain.entity.Address;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface AddressRepository extends Repository,JpaRepository<Address,Id>{

}