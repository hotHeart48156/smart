package  org.activite.service.query.entity;

import org.activite.domain.entity.CouponHistory;
import org.activite.executor.query.entity.CouponHistoryQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CouponHistoryQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CouponHistory>  query(CouponHistoryQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CouponHistory.class)).join();
}
}
