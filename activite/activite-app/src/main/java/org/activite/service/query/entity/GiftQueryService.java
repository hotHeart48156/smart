package  org.activite.service.query.entity;

import org.activite.domain.entity.Gift;
import org.activite.executor.query.entity.GiftQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GiftQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Gift>  query(GiftQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Gift.class)).join();
}
}
