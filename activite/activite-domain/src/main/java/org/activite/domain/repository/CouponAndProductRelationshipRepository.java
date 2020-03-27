package  org.activite.domain.repository;

import org.activite.domain.entity.CouponAndProductRelationship;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CouponAndProductRelationshipRepository extends Repository,JpaRepository<CouponAndProductRelationship, Id>{
}
