package  org.activite.domain.repository;

import org.activite.domain.entity.PromotionLog;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PromotionLogRespository extends Respository,JpaRepository<PromotionLog, Id>{
}
