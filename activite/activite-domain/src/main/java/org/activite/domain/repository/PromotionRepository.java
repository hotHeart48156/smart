package  org.activite.domain.repository;

import org.activite.domain.aggregation.Promotion;
import org.activite.domain.valueobject.id.PromotionId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PromotionRepository extends Repository,JpaRepository<Promotion, PromotionId>{
}
