package  org.users.queryhandle.aggre;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.aggregation.Aggregation;
import org.users.domain.aggregation.User;
import org.users.domain.entity.Entity;
import org.users.domain.repository.UserRepository;
import org.users.executor.query.aggre.UserQuery;

import java.util.List;
public class UserQueryHandle<T extends Entity,A extends Aggregation>{
    @Autowired
    CacheService cacheService;
    @Autowired
    UserRepository repository;
    @QueryHandler
public List<T>query(UserQuery query){
return cacheService.query(new QueryCache(query.getId(),repository));

}}
