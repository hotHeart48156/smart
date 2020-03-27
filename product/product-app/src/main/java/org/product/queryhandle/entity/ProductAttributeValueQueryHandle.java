package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductAttributeValue;
import org.product.domain.repository.entity.ProductAttributeValueRepository;
import org.product.executor.query.entity.ProductAttributeValueQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductAttributeValueQueryHandle{
  @Autowired
private ProductAttributeValueRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductAttributeValue>query(ProductAttributeValueQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
