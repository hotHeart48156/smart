package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductSkuStock;
import org.product.domain.repository.entity.ProductSkuStockRepository;
import org.product.executor.query.entity.ProductSkuStockQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductSkuStockQueryHandle{
  @Autowired
private ProductSkuStockRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductSkuStock>query(ProductSkuStockQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
