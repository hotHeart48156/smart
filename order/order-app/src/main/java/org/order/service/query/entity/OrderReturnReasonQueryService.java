package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.OrderReturnReason;
import org.order.executor.query.entity.OrderReturnReasonQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderReturnReasonQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderReturnReason>  query(OrderReturnReasonQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderReturnReason.class)).join();
}
}
