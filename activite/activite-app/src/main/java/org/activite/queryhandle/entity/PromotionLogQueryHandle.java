package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.PromotionLog;
import org.activite.domain.repository.PromotionLogRepository;
import org.activite.executor.query.entity.PromotionLogQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class PromotionLogQueryHandle extends AbstractQueryHandle {
  @Autowired
private PromotionLogRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<PromotionLog>query(PromotionLogQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
