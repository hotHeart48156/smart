package  org.order.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CartItemQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CartItem>  query(CartItemQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CartItem.class)).join();
}
}
