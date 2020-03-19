package  org.activite.service.query;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class GiftQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Gift>  query(GiftQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Gift.class)).join();
}
}
