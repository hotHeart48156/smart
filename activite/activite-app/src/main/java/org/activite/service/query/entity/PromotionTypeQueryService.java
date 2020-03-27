package  org.activite.service.query.entity;

import org.activite.domain.entity.PromotionType;
import org.activite.executor.query.entity.PromotionTypeQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class PromotionTypeQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<PromotionType>  query(PromotionTypeQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(PromotionType.class)).join();
}
}
