package org.users.queryhandle.entity;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.cache.CacheService;
import org.users.cache.QueryCache;
import org.users.domain.entity.Role;
import org.users.domain.repository.RoleRepository;
import org.users.executor.query.entity.RoleQuery;
import org.users.queryhandle.AbstractQueryHandle;

import java.util.List;
public class RoleQueryHandle  extends AbstractQueryHandle {

    @Autowired
private CacheService service ;
    @Autowired
    private RoleRepository roleRepository;
@QueryHandler
public List<Role>query(RoleQuery query) {

    return service.query(new QueryCache(query.getId(), roleRepository));
}}