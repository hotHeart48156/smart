package  org.order.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.Address;
import org.order.domain.repository.AddressRepository;
import org.order.executor.query.entity.AddressQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AddressQueryHandle {
    @Autowired
private CacheService cacheService;
    @Autowired
    private AddressRepository repository;
@QueryHandler
public List<Address>query(AddressQuery query){

    return cacheService.query(new QueryCache(query.getKey(),repository));

}}
