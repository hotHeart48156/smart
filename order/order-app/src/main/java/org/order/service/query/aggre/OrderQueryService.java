package  org.order.service.query.aggre;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.aggregation.Order;
import org.order.executor.query.aggre.OrderQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Order>  query(OrderQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Order.class)).join();
}
}
