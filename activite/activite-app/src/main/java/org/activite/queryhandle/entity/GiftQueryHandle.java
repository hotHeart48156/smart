package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.Gift;
import org.activite.domain.repository.GiftRepository;
import org.activite.executor.query.entity.GiftQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GiftQueryHandle extends AbstractQueryHandle {
  @Autowired
private GiftRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<Gift>query(GiftQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
