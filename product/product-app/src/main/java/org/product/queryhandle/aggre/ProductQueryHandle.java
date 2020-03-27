package  org.product.queryhandle.aggre;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.aggragate.Product;
import org.product.domain.repository.aggregation.ProductRepository;
import org.product.executor.query.aggre.ProductQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductQueryHandle{
    @Autowired
    ProductRepository repository;
    @Autowired
    CacheService cacheService;
    @QueryHandler
public List<Product>query(ProductQuery query){

        return cacheService.query(new QueryCache(query.getId(),repository));

}}
