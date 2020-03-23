package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Entity;
import org.users.domain.repository.AppletSetRepository;
import org.users.executor.query.entity.AppletSetQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class AppletSetQueryHandle  <T extends Entity>extends AbstractQueryHandle {
    @Autowired
private CacheService service ;
    @Autowired
    AppletSetRepository repository;
@QueryHandler
public List query(AppletSetQuery query){
return service.query(new QueryCache(query.getId(),repository));

}}
