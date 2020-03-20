package  org.activite.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.activite.domain.aggregation.*;
import org.activite.domain.entity.*;
public interface CouponHistoryRespository extends Respository,JpaRepository<CouponHistory,CouponHistoryId>{
}
