package org.product.domain.repository.aggregation;

import org.product.domain.aggragate.Product;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId>, Repository {

}