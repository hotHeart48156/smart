package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.GiftsCategory;
import org.product.domain.repository.entity.GiftsCategoryRepository;
import org.product.executor.query.entity.GiftsCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GiftsCategoryQueryHandle{
  @Autowired
private GiftsCategoryRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<GiftsCategory>query(GiftsCategoryQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
