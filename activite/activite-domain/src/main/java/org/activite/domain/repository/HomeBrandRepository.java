package  org.activite.domain.repository;

import org.activite.domain.entity.HomeBrand;
import org.activite.domain.valueobject.id.Id;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HomeBrandRepository extends Repository,JpaRepository<HomeBrand, Id>{
}
