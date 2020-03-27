package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.HomeNewProduct;
import org.activite.domain.repository.HomeNewProductRepository;
import org.activite.executor.query.entity.HomeNewProductQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeNewProductQueryHandle extends AbstractQueryHandle {
  @Autowired
private HomeNewProductRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<HomeNewProduct>query(HomeNewProductQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
