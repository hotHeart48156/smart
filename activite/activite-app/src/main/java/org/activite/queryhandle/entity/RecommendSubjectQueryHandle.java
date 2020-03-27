package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.RecommendSubject;
import org.activite.domain.repository.RecommendSubjectRepository;
import org.activite.executor.query.entity.RecommendSubjectQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class RecommendSubjectQueryHandle extends AbstractQueryHandle {
  @Autowired
private RecommendSubjectRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<RecommendSubject>query(RecommendSubjectQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
