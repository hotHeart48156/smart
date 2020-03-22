package org.users.service.queryservice;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class TagQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Tag>  query(TagQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Tag.class)).join();
}
}
