package  org.activite.queryhandle.entity;

import org.activite.cache.CacheService;
import org.activite.cache.QueryCache;
import org.activite.domain.entity.GroupMember;
import org.activite.domain.repository.GroupMemberRepository;
import org.activite.executor.query.entity.GroupMemberQuery;
import org.activite.queryhandle.AbstractQueryHandle;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class GroupMemberQueryHandle extends AbstractQueryHandle {
  @Autowired
private GroupMemberRepository repository;
@Autowired
 private CacheService cacheService;
    @QueryHandler
public List<GroupMember>query(GroupMemberQuery query){


return cacheService.query(new QueryCache(query.getId(),repository));}
}
