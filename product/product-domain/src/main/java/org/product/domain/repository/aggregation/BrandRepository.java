package org.product.domain.repository.aggregation;

import org.product.domain.aggragate.Brand;
import org.product.domain.repository.Repository;
import org.product.domain.valueobject.id.BrandId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, BrandId>, Repository {

}