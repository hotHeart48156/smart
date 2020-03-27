package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.CouponHistory;
import org.activite.domain.repository.CouponHistoryRepository;
import org.activite.executor.query.entity.CouponHistoryQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CouponHistoryQueryHandle extends AbstractQueryHandle {
  @Autowired
private CouponHistoryRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<CouponHistory>query(CouponHistoryQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
