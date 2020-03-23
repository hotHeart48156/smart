package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Entity;
import org.users.domain.repository.TagRepository;
import org.users.executor.query.entity.TagQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class TagQueryHandle  <T extends Entity>extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    TagRepository repository;
 @QueryHandler
public List<T>query(TagQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
