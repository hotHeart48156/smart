package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.OrderReturnApply;
import org.order.domain.repository.OrderReturnApplyRepository;
import org.order.executor.query.entity.OrderReturnApplyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class OrderReturnApplyQueryHandle {
           @Autowired
private CacheService cacheService;
           @Autowired
           private OrderReturnApplyRepository repository;
@QueryHandler
public List<OrderReturnApply>query(OrderReturnApplyQuery query){
    return cacheService.query(new QueryCache(query.getKey(),repository));


}}
