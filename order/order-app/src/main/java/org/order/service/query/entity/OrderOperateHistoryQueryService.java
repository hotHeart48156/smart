package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.OrderOperateHistory;
import org.order.executor.query.entity.OrderOperateHistoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderOperateHistoryQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderOperateHistory>  query(OrderOperateHistoryQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderOperateHistory.class)).join();
}
}
