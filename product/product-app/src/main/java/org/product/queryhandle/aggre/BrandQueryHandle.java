package  org.product.queryhandle.aggre;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.aggragate.Brand;
import org.product.domain.repository.aggregation.BrandRepository;
import org.product.executor.query.aggre.BrandQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BrandQueryHandle{
    @Autowired
    BrandRepository repository;
    @Autowired
    CacheService cacheService;
    @QueryHandler
public List<Brand>query(BrandQuery query){
return cacheService.query(new QueryCache(query.getId(),repository));
}}
