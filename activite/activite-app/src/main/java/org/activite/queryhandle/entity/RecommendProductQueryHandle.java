package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.RecommendProduct;
import org.activite.domain.repository.RecommendProductRepository;
import org.activite.executor.query.entity.RecommendProductQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class RecommendProductQueryHandle extends AbstractQueryHandle {
  @Autowired
private RecommendProductRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<RecommendProduct>query(RecommendProductQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
