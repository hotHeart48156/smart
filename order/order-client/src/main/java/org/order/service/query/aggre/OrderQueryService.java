package  org.order.service.query.aggre;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class OrderQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Order>  query(OrderQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Order.class)).join();
}
}
