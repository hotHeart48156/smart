package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.FreightTemplate;
import org.product.domain.repository.entity.FreightTemplateRepository;
import org.product.executor.query.entity.FreightTemplateQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FreightTemplateQueryHandle{
  @Autowired
private FreightTemplateRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<FreightTemplate>query(FreightTemplateQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
