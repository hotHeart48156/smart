package  org.activite.domain.repository;

import org.activite.domain.entity.RecommendSubject;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecommendSubjectRespository extends Respository,JpaRepository<RecommendSubject, Id>{
}
