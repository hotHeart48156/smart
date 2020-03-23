package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.IntegrationChangeHistoryItem;
import org.users.domain.repository.IntegrationChangeHistoryRepository;
import org.users.executor.query.entity.IntegrationChangeHistoryItemQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class IntegrationChangeHistoryItemQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    IntegrationChangeHistoryRepository repository;
@QueryHandler
public List<IntegrationChangeHistoryItem>query(IntegrationChangeHistoryItemQuery query){

return service.query(new QueryCache(query.getId(),repository));
}}
