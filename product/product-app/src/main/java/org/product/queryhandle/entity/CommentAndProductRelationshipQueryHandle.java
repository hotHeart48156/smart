package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.CommentAndProductRelationship;
import org.product.domain.repository.entity.CommentAndProductRelationshipRepository;
import org.product.executor.query.entity.CommentAndProductRelationshipQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentAndProductRelationshipQueryHandle{
  @Autowired
private CommentAndProductRelationshipRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<CommentAndProductRelationship>query(CommentAndProductRelationshipQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
