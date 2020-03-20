package  org.activite.domain.repository;

import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.id.RedPacketId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RedPacketRespository extends Respository,JpaRepository<RedPacket, RedPacketId>{
}
