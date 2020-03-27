package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.PromotionType;
import org.activite.domain.repository.PromotionTypeRepository;
import org.activite.executor.query.entity.PromotionTypeQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class PromotionTypeQueryHandle extends AbstractQueryHandle {
  @Autowired
private PromotionTypeRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<PromotionType>query(PromotionTypeQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
