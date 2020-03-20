package  org.activite.domain.repository;

import org.activite.domain.entity.GroupMember;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GroupMemberRespository extends Respository,JpaRepository<GroupMember, Id>{
}
