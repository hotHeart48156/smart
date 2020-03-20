package  org.activite.domain.repository;

import org.activite.domain.entity.HomeAdvertise;
import org.activite.domain.valueobject.id.HomeAdvertiseId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HomeAdvertiseRespository extends Respository,JpaRepository<HomeAdvertise, HomeAdvertiseId>{
}
