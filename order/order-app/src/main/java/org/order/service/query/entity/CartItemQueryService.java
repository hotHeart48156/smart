package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.CartItem;
import org.order.executor.query.entity.CartItemQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartItemQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CartItem>  query(CartItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CartItem.class)).join();
}
}
