package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.UserCollect;
import org.users.domain.repository.UserCollectRepository;
import org.users.executor.query.entity.UserCollectQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class UserCollectQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    UserCollectRepository repository;
 @QueryHandler
public List<UserCollect>query(UserCollectQuery query) {
   return   service.query(new QueryCache(query.getId(), repository));

 }}
