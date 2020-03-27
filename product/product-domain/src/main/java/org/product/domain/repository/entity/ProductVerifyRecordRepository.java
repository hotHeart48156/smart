package org.product.domain.repository.entity;

import org.product.domain.entity.ProductVerifyRecord;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ProductVerifyRecordRepository extends Repository,JpaRepository<ProductVerifyRecord,Id>{

}