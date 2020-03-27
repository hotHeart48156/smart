package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.Address;
import org.product.domain.repository.entity.AddressRepository;
import org.product.executor.query.entity.AddressQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressQueryHandle{
  @Autowired
private AddressRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<Address>query(AddressQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
