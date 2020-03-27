package  org.activite.service.query.entity;

import org.activite.domain.entity.RedPacketAndUserRelationship;
import org.activite.executor.query.entity.RedPacketAndUserRelationshipQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class RedPacketAndUserRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<RedPacketAndUserRelationship>  query(RedPacketAndUserRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(RedPacketAndUserRelationship.class)).join();
}
}
