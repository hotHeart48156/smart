package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductLadder;
import org.product.domain.repository.entity.ProductLadderRepository;
import org.product.executor.query.entity.ProductLadderQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductLadderQueryHandle{
  @Autowired
private ProductLadderRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductLadder>query(ProductLadderQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
