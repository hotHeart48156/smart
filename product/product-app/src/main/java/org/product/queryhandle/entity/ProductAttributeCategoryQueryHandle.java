package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductAttributeCategory;
import org.product.domain.repository.entity.ProductAttributeCategoryRepository;
import org.product.executor.query.entity.ProductAttributeCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductAttributeCategoryQueryHandle{
  @Autowired
private ProductAttributeCategoryRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductAttributeCategory>query(ProductAttributeCategoryQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
