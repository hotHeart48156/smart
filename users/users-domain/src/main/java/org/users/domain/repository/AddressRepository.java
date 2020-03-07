package org.users.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.users.domain.entity.Address;
import org.users.domain.valueobject.id.Id;

/**
 * @author "yangbiao"
 */
public interface AddressRepository extends JpaRepository<Address, Id>, PagingAndSortingRepository<Address, Id> {
}
