package  org.activite.domain.repository;

import org.activite.domain.entity.CouponAndUserRelationship;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CouponAndUserRelationshipRepoitory extends Repository,JpaRepository<CouponAndUserRelationship, Id>{
}
