package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.HomeBrand;
import org.activite.domain.repository.HomeBrandRepository;
import org.activite.executor.query.entity.HomeBrandQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeBrandQueryHandle extends AbstractQueryHandle {
  @Autowired
private HomeBrandRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<HomeBrand>query(HomeBrandQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
