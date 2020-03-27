package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.SubjectAndProductRelation;
import org.product.domain.repository.entity.SubjectAndProductRelationRepository;
import org.product.executor.query.entity.SubjectAndProductRelationQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectAndProductRelationQueryHandle{
  @Autowired
private SubjectAndProductRelationRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<SubjectAndProductRelation>query(SubjectAndProductRelationQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
