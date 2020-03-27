package  org.order.queryhandle;

import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.aggregation.Order;
import org.order.domain.repository.OrderRepository;
import org.order.executor.query.aggre.OrderQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class OrderQueryHandle{
    @Autowired
    CacheService cacheService;
    @Autowired
    OrderRepository repository;
    @QueryHandler
public List<Order>query(OrderQuery query){
        return cacheService.query(new QueryCache(query.getKey(),repository));
}}
