package  org.activite.domain.repository;

import org.activite.domain.entity.HomeNewProduct;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HomeNewProductRepository extends Repository,JpaRepository<HomeNewProduct, Id>{
}
