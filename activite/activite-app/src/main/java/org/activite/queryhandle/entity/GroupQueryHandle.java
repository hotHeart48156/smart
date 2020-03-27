package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.aggregation.Group;
import org.activite.domain.repository.GroupRepository;
import org.activite.executor.query.aggre.GroupQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GroupQueryHandle extends AbstractQueryHandle {
  @Autowired
private GroupRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<Group>query(GroupQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
