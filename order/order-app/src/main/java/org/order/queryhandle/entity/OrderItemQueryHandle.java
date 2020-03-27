package  org.order.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.OrderItem;
import org.order.domain.repository.OrderItemRepository;
import org.order.executor.query.entity.OrderItemQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class OrderItemQueryHandle {
           @Autowired
    OrderItemRepository repository;
           @Autowired
private CacheService cacheService;

@QueryHandler
public List<OrderItem>query(OrderItemQuery query){

    return cacheService.query(new QueryCache(query.getKey(),repository));

}}
