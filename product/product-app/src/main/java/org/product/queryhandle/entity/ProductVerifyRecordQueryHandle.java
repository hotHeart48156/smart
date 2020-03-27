package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductVerifyRecord;
import org.product.domain.repository.entity.ProductVerifyRecordRepository;
import org.product.executor.query.entity.ProductVerifyRecordQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductVerifyRecordQueryHandle{
  @Autowired
private ProductVerifyRecordRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductVerifyRecord>query(ProductVerifyRecordQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
