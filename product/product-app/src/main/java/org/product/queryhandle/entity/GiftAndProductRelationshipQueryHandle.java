package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.GiftAndProductRelationship;
import org.product.domain.repository.entity.GiftAndProductRelationshipRepository;
import org.product.executor.query.entity.GiftAndProductRelationshipQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GiftAndProductRelationshipQueryHandle{
  @Autowired
private GiftAndProductRelationshipRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<GiftAndProductRelationship>query(GiftAndProductRelationshipQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
