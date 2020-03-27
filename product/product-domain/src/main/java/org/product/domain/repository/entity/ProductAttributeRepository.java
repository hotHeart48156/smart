package org.product.domain.repository.entity;

import org.product.domain.entity.ProductAttribute;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ProductAttributeRepository extends Repository,JpaRepository<ProductAttribute,ProductAttributeId>{

}