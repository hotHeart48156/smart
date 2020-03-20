package  org.activite.domain.repository;

import org.activite.domain.aggregation.Marketing;
import org.activite.domain.valueobject.id.MarketingId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MarketingRespository extends Respository,JpaRepository<Marketing, MarketingId>{
}
