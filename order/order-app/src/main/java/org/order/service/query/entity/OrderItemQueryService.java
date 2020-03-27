package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.OrderItem;
import org.order.executor.query.entity.OrderItemQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderItem>  query(OrderItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderItem.class)).join();
}
}
