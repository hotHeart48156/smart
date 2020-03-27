package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductCategory;
import org.product.domain.repository.entity.ProductCategoryRepository;
import org.product.executor.query.entity.ProductCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductCategoryQueryHandle{
  @Autowired
private ProductCategoryRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductCategory>query(ProductCategoryQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
