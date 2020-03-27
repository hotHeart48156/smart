package org.product.domain.repository.entity;

import org.product.domain.entity.ProductAttributeCategory;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ProductAttributeCategoryRepository extends Repository,JpaRepository<ProductAttributeCategory,ProductAttributeCategoryId>{

}