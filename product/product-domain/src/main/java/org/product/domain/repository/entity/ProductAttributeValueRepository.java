package org.product.domain.repository.entity;

import org.product.domain.entity.ProductAttributeValue;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ProductAttributeValueRepository extends Repository,JpaRepository<ProductAttributeValue,Id>{

}