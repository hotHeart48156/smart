package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductFullReduction;
import org.product.domain.repository.entity.ProductFullReductionRepository;
import org.product.executor.query.entity.ProductFullReductionQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductFullReductionQueryHandle{
  @Autowired
private ProductFullReductionRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductFullReduction>query(ProductFullReductionQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
