package org.product.domain.repository.entity;

import org.product.domain.entity.ProductCategory;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.ProductCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ProductCategoryRepository extends Repository,JpaRepository<ProductCategory,ProductCategoryId>{

}