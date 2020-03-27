package  org.activite.domain.repository;

import org.activite.domain.entity.PromotionType;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PromotionTypeRepository extends Repository,JpaRepository<PromotionType, Id>{
}
