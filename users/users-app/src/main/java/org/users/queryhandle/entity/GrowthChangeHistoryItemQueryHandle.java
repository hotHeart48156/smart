package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Entity;
import org.users.domain.repository.GrowthChangeHistoryItemRepository;
import org.users.executor.query.entity.GrowthChangeHistoryItemQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;

public class GrowthChangeHistoryItemQueryHandle  <T extends Entity>extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    GrowthChangeHistoryItemRepository repository;

 @QueryHandler
public List<T> query(GrowthChangeHistoryItemQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
