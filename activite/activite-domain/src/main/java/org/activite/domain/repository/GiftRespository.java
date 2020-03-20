package  org.activite.domain.repository;

import org.activite.domain.entity.Gift;
import org.activite.domain.valueobject.id.GiftId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GiftRespository extends Respository,JpaRepository<Gift, GiftId>{
}
