package  org.activite.domain.repository;

import org.activite.domain.aggregation.Promotion;
import org.activite.domain.valueobject.id.PromotionId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PromotionRespository extends Respository,JpaRepository<Promotion, PromotionId>{
}
