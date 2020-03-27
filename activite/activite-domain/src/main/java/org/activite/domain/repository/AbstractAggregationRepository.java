package  org.activite.domain.repository;

import org.activite.domain.aggregation.Aggregation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractAggregationRepository extends Repository,JpaRepository<Aggregation,AbstractAggregationId>{
}
