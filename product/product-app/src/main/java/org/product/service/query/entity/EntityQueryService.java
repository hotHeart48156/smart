package org.product.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class EntityQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Entity>  query(EntityQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Entity.class)).join();
}
}
