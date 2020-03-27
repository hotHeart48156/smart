package  org.order.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.OrderOperateHistory;
import org.order.domain.repository.OrderOperateHistoryRepository;
import org.order.executor.query.entity.OrderOperateHistoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class OrderOperateHistoryQueryHandle {
           @Autowired
private CacheService cacheService;
           @Autowired
           private OrderOperateHistoryRepository repository;
@QueryHandler
public List<OrderOperateHistory>query(OrderOperateHistoryQuery query){

               return cacheService.query(new QueryCache(query.getKey(),repository));

}}
