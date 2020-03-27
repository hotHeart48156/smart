package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductOperateLog;
import org.product.domain.repository.entity.ProductOperateLogRepository;
import org.product.executor.query.entity.ProductOperateLogQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductOperateLogQueryHandle{
  @Autowired
private ProductOperateLogRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductOperateLog>query(ProductOperateLogQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
