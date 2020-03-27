package org.order.domain.repository;

import org.order.domain.entity.CompanyAddress;
import org.order.domain.vaueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyAddressRepository extends JpaRepository<CompanyAddress, Id>{

}