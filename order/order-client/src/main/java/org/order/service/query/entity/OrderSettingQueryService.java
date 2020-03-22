package  org.order.service.query.entity;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class OrderSettingQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderSetting>  query(OrderSettingQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderSetting.class)).join();
}
}