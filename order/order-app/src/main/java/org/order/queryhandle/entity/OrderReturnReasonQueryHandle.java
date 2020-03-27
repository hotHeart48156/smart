package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.OrderReturnReason;
import org.order.domain.repository.OrderReturnReasonRepository;
import org.order.executor.query.entity.OrderReturnReasonQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class OrderReturnReasonQueryHandle {
           @Autowired
    OrderReturnReasonRepository repository;
           @Autowired
private CacheService cacheService;

@QueryHandler
public List<OrderReturnReason>query(OrderReturnReasonQuery query){
    return cacheService.query(new QueryCache(query.getKey(),repository));


}}
