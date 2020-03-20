package  org.activite.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.activite.domain.aggregation.*;
import org.activite.domain.entity.*;
public interface AbstractAggregationRespository extends Respository,JpaRepository<AbstractAggregation,AbstractAggregationId>{
}
