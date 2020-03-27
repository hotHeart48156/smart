package  org.order.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.order.domain.entity.OrderReturnApply;
import org.order.executor.query.entity.OrderReturnApplyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderReturnApplyQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<OrderReturnApply>  query(OrderReturnApplyQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(OrderReturnApply.class)).join();
}
}
