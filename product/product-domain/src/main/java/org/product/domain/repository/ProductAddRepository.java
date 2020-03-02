package org.product.domain.repository;

import org.product.domain.valueobject.id.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author "yangbiao"
 */
public interface ProductAddRepository extends JpaRepository<ProductAdd, ProductId>, JpaSpecificationExecutor<ProductAdd> {
}
