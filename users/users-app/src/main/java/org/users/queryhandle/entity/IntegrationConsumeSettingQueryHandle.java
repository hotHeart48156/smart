package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.IntegrationConsumeSetting;
import org.users.domain.repository.IntegrationConsumeSettingRepository;
import org.users.executor.query.entity.IntegrationConsumeSettingQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class IntegrationConsumeSettingQueryHandle  extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    private IntegrationConsumeSettingRepository repository;
@QueryHandler
public List<IntegrationConsumeSetting>query(IntegrationConsumeSettingQuery query){

return service.query(new QueryCache(query.getId(),repository));
}}
