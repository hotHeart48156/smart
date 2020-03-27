package  org.product.queryhandle.entity;
import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.Comment;
import org.product.domain.repository.entity.CommentRepository;
import org.product.executor.query.entity.CommentQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentQueryHandle{
  @Autowired
private CommentRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<Comment>query(CommentQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
