package  org.activite.domain.repository;

import org.activite.domain.entity.PromotionLog;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PromotionLogRepository extends Repository,JpaRepository<PromotionLog, Id>{
}
