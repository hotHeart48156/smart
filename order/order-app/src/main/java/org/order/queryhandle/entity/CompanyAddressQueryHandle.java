package  org.order.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.order.cache.CacheService;
import org.order.cache.QueryCache;
import org.order.domain.entity.CompanyAddress;
import org.order.domain.repository.CompanyAddressRepository;
import org.order.executor.query.entity.CompanyAddressQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component 
public class CompanyAddressQueryHandle {
           @Autowired
    CompanyAddressRepository repository;
           @Autowired
private CacheService cacheService;

@QueryHandler
public List<CompanyAddress>query(CompanyAddressQuery query){
    return cacheService.query(new QueryCache(query.getKey(),repository));


}}
