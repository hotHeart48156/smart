package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.ProductConsult;
import org.product.domain.repository.entity.ProductConsultRepository;
import org.product.executor.query.entity.ProductConsultQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductConsultQueryHandle{
  @Autowired
private ProductConsultRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<ProductConsult>query(ProductConsultQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
