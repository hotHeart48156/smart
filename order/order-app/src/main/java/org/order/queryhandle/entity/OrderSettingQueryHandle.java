package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.OrderSetting;
import org.order.domain.repository.OrderSettingRepository;
import org.order.executor.query.entity.OrderSettingQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class OrderSettingQueryHandle {
           @Autowired
    OrderSettingRepository repository;
           @Autowired
private CacheService cacheService;

@QueryHandler
public List<OrderSetting>query(OrderSettingQuery query){
    return cacheService.query(new QueryCache(query.getKey(),repository));


}}
