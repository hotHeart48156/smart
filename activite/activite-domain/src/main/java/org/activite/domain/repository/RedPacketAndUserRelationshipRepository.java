package  org.activite.domain.repository;

import org.activite.domain.entity.RedPacketAndUserRelationship;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RedPacketAndUserRelationshipRepository extends Repository,JpaRepository<RedPacketAndUserRelationship, Id>{
}
