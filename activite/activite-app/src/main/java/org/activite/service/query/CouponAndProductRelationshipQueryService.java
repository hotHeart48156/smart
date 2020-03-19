package  org.activite.service.query;

import org.activite.domain.entity.CouponAndProductRelationship;
import org.activite.executor.query.entity.CouponAndProductRelationshipQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CouponAndProductRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CouponAndProductRelationship>  query(CouponAndProductRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CouponAndProductRelationship.class)).join();
}
}
