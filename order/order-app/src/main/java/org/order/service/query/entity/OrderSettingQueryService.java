package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.OrderSetting;
import org.order.executor.query.entity.OrderSettingQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderSettingQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderSetting>  query(OrderSettingQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderSetting.class)).join();
}
}
