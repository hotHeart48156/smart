package  org.activite.domain.repository;

import org.activite.domain.entity.RecommendProduct;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecommendProductRespository extends Respository,JpaRepository<RecommendProduct, Id>{
}
