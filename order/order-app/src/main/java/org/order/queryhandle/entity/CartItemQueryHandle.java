package  org.order.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.CartItem;
import org.order.domain.repository.CartItemRepository;
import org.order.executor.query.entity.CartItemQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CartItemQueryHandle {
           @Autowired
    CartItemRepository repository;
           @Autowired
private CacheService cacheService;

@QueryHandler
public List<CartItem>query(CartItemQuery query){

return cacheService.query(new QueryCache(query.getKey(),repository));
}}
