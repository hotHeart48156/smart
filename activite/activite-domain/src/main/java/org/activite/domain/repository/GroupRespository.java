package  org.activite.domain.repository;

import org.activite.domain.aggregation.Group;
import org.activite.domain.valueobject.id.GroupId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GroupRespository extends Respository,JpaRepository<Group, GroupId>{
}
