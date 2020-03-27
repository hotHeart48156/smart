package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.HomeAdvertise;
import org.activite.domain.repository.HomeAdvertiseRepository;
import org.activite.executor.query.entity.HomeAdvertiseQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeAdvertiseQueryHandle extends AbstractQueryHandle {
  @Autowired
private HomeAdvertiseRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<HomeAdvertise>query(HomeAdvertiseQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
