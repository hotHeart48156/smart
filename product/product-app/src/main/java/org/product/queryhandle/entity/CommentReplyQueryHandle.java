package  org.product.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.product.cache.CacheService;
import org.product.cache.QueryCache;
import org.product.domain.entity.CommentReply;
import org.product.domain.repository.entity.CommentReplyRepository;
import org.product.executor.query.entity.CommentReplyQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentReplyQueryHandle{
  @Autowired
private CommentReplyRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<CommentReply>query(CommentReplyQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
