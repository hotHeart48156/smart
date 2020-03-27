package  org.activite.service.query.entity;

import org.activite.domain.entity.CouponAndUserRelationship;
import org.activite.executor.query.entity.CouponAndUserRelationshipQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CouponAndUserRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CouponAndUserRelationship>  query(CouponAndUserRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CouponAndUserRelationship.class)).join();
}
}
