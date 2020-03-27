package  org.activite.service.query.entity;

import org.activite.domain.entity.PromotionLog;
import org.activite.executor.query.entity.PromotionLogQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class PromotionLogQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<PromotionLog>  query(PromotionLogQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(PromotionLog.class)).join();
}
}
